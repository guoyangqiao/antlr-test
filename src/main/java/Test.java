import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Test extends ackBaseVisitor<Object> {
    private static final String MYSQL_HOST_KEY = "mysqlHost";
    private static final String MYSQL_PORT_KEY = "mysqlPort";
    private static final String MYSQL_USER_NAME_KEY = "mysqlUserName";
    private static final String MYSQL_PASSWORD_KEY = "mysqlPassword";
    private static final String MYSQL_DB_KEY = "mysqlDb";
    private final Map<String, Object> variables = new HashMap<>();
    private final Deque<SqlContext> sqlContextStack = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromStream(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.txt"));
        Lexer lexer = new ackLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ackParser parser = new ackParser(tokens);
        ParseTree tree = parser.prog(); // parse
        Test vt = new Test();
        vt.visit(tree);
    }

    public Object visitProg(ackParser.ProgContext ctx) {
        System.out.println("开始执行");
        for (ackParser.StatContext statContext : ctx.stat()) {
            System.out.println("开始处理[" + statContext.getText() + "]");
            statContext.accept(this);
        }
        System.out.println("结束执行");
        return null;
    }

    public Object visitExp(ackParser.ExpContext ctx) {
        return super.visitExp(ctx);
    }

    public Object visitAssign(ackParser.AssignContext ctx) {
        final TerminalNode id = ctx.ID();
        final String text = id.getText();
        variables.put(text, ctx.expr().accept(this));
        return null;
    }

    public Object visitBlank(ackParser.BlankContext ctx) {
        return null;
    }

    public Object visitSelect(ackParser.SelectContext ctx) {
        sqlContextStack.push(new SqlContext());
        ctx.from_clause().accept(this);
        final ackParser.Where_clauseContext where_clauseContext = ctx.where_clause();
        if (where_clauseContext != null) {
            where_clauseContext.accept(this);
        }
        final ackParser.Limit_clauseContext limit_clauseContext = ctx.limit_clause();
        if (limit_clauseContext != null) {
            limit_clauseContext.accept(this);
        }
        ctx.select_clause().accept(this);
        return sqlContextStack.pop().tableData.pop();
    }

    public Object visitString(ackParser.StringContext ctx) {
        return ctx.getText();
    }

    public Object visitInt(ackParser.IntContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    public Object visitPrint(ackParser.PrintContext ctx) {
        System.out.println(variables.get(ctx.ID().getText()));
        return null;
    }

    public Object visitSelect_clause(ackParser.Select_clauseContext ctx) {
        final SqlContext sqlContext = sqlContextStack.peek();
        final Deque<TableData> tableData = sqlContext.tableData;
        final TableData pop = tableData.pop();
        final List<String> cols = pop.cols;
        final List<List<String>> rows = pop.rows;
        final List<String> projectCols = ctx.field().stream().map(RuleContext::getText).collect(Collectors.toList());
        final List<List<String>> projectRows = rows.stream().map(x -> {
            final List<String> newRow = new ArrayList<>();
            for (String projectCol : projectCols) {
                for (int i = 0; i < cols.size(); i++) {
                    if (projectCol.equalsIgnoreCase(cols.get(i))) {
                        newRow.add(x.get(i));
                    }
                }
            }
            return newRow;
        }).collect(Collectors.toList());
        final TableData projectData = new TableData();
        projectData.cols = projectCols;
        projectData.rows = projectRows;
        sqlContext.tableData.push(projectData);
        return null;
    }

    public Object visitFROM_BASIC(ackParser.FROM_BASICContext ctx) {
        final String text = ctx.field().getText();
        return visitSingleTable(TableDef.parse(text));
    }

    private Object visitSingleTable(TableDef text) {
        final SqlContext sqlContext = sqlContextStack.peek();
        final String tableName = text.table;
        final List<List<String>> results = new ArrayList<>();
        final List<String> tableDef = new ArrayList<>();
        final TableData tableData = new TableData();
        if (text.engine.equalsIgnoreCase("mysql")) {
            final Object obj = variables.get(MYSQL_PASSWORD_KEY);
            String password = null;
            if (obj != null) {
                password = String.valueOf(obj);
            }
            final String url = "jdbc:mysql://" + variables.get(MYSQL_HOST_KEY) + ":" + variables.get(MYSQL_PORT_KEY) + "/" + variables.get(MYSQL_DB_KEY) + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            final String user = String.valueOf(variables.get(MYSQL_USER_NAME_KEY));
            try (final Connection connection = DriverManager.getConnection(url, user, password)) {
                try (final PreparedStatement preparedStatement = connection.prepareStatement("select * from " + tableName)) {
                    final ResultSet resultSet = preparedStatement.executeQuery();
                    tableData.name = tableName;
                    final ResultSetMetaData metaData = resultSet.getMetaData();
                    final int columnCount = metaData.getColumnCount();
                    for (int i = 0; i < columnCount; i++) {
                        tableDef.add(text.fullPath() + "." + metaData.getColumnLabel(i + 1));
                    }
                    while (resultSet.next()) {
                        final List<String> objects = new ArrayList<>();
                        for (int i = 0; i < columnCount; i++) {
                            final String object = resultSet.getString(i + 1);
                            objects.add(object);
                        }
                        results.add(objects);
                    }
                    tableData.cols = tableDef;
                    tableData.rows = results;
                    sqlContext.tableData.push(tableData);
                    return null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                final InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(text.table + ".txt");
                final List<String> strings = IOUtils.readLines(resourceAsStream);

                for (int i = 1; i < strings.size(); i++) {
                    final String s = strings.get(i);
                    final String[] split2 = s.split(",");
                    final List<String> row = Arrays.asList(split2);
                    results.add(row);
                }
                tableData.cols = Arrays.stream(strings.get(0).split(",")).map(x -> text.fullPath() + "." + x).collect(Collectors.toList());
                tableData.name = tableName;
                tableData.rows = results;
                sqlContext.tableData.push(tableData);
                return null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException();
    }

    public Object visitFROM_JOIN(ackParser.FROM_JOINContext ctx) {
        final SqlContext sqlContext = sqlContextStack.peek();
        final Deque<TableData> tableDataDeque = sqlContext.tableData;
        final TableDef leftTableDef = TableDef.parse(ctx.field(0).getText());
        final TableDef rightTableDef = TableDef.parse(ctx.field(1).getText());
        visitSingleTable(leftTableDef);
        visitSingleTable(rightTableDef);
        final FieldDef leftFieldDef = FieldDef.parse(ctx.field(2).getText());
        final FieldDef rightFieldDef = FieldDef.parse(ctx.field(3).getText());
        final TableData rightTableData = tableDataDeque.pop();
        final TableData leftTableData = tableDataDeque.pop();
        final List<List<String>> leftData = leftTableData.rows;
        final List<List<String>> rightData = rightTableData.rows;
        final List<String> lefTableDef = leftTableData.cols;
        int targetLeftField = getString(leftFieldDef, lefTableDef);
        final List<String> rigTableDef = rightTableData.cols;
        int targetRightField = getString(rightFieldDef, rigTableDef);
        final List<List<String>> targetData = new ArrayList<>();
        for (List<String> leftDatum : leftData) {
            for (List<String> rightDatum : rightData) {
                if (leftDatum.get(targetLeftField).equalsIgnoreCase(rightDatum.get(targetRightField))) {
                    final ArrayList<String> strings = new ArrayList<>();
                    targetData.add(strings);
                    strings.addAll(leftDatum);
                    strings.addAll(rightDatum);
                }
            }
        }
        final TableData tableData = new TableData();
        tableData.rows = targetData;
        List<String> targetCols = new ArrayList<>();
        targetCols.addAll(lefTableDef);
        targetCols.addAll(rigTableDef);
        tableData.cols = targetCols;
        tableData.name = null;
        tableDataDeque.push(tableData);
        return null;
    }

    public Object visitLimit_clause(ackParser.Limit_clauseContext ctx) {
        final SqlContext peekCtx = sqlContextStack.peek();
        final TableData peekData = peekCtx.tableData.peek();
        final int toIndex = Integer.parseInt(ctx.POSITIVE_INT().getText());
        final ArrayList<List<String>> lists = new ArrayList<>(peekData.rows.subList(0, Math.min(toIndex, peekData.rows.size())));
        peekData.rows = lists;
        return null;
    }

    public Object visitEQ(ackParser.EQContext ctx) {
        BiFunction<BigDecimal, BigDecimal, Boolean> cc = (bigDecimal, bigDecimal2) -> bigDecimal.compareTo(bigDecimal2) == 0;
        return compare(ctx.comparable(0), ctx.comparable(1), cc);
    }

    public Object visitNEQ(ackParser.NEQContext ctx) {
        BiFunction<BigDecimal, BigDecimal, Boolean> cc = (bigDecimal, bigDecimal2) -> bigDecimal.compareTo(bigDecimal2) != 0;
        return compare(ctx.comparable(0), ctx.comparable(1), cc);
    }

    public Object visitGT(ackParser.GTContext ctx) {
        BiFunction<BigDecimal, BigDecimal, Boolean> cc = (bigDecimal, bigDecimal2) -> bigDecimal.compareTo(bigDecimal2) > 0;
        return compare(ctx.comparable(0), ctx.comparable(1), cc);
    }

    public Object visitLT(ackParser.LTContext ctx) {
        BiFunction<BigDecimal, BigDecimal, Boolean> cc = (bigDecimal, bigDecimal2) -> bigDecimal.compareTo(bigDecimal2) < 0;
        return compare(ctx.comparable(0), ctx.comparable(1), cc);
    }

    public Object visitC_FIELD(ackParser.C_FIELDContext ctx) {
        return 1 / 0;
    }

    public Object visitP_INT(ackParser.P_INTContext ctx) {
        return new BigDecimal(ctx.getText());
    }

    public Object visitATOMIC(ackParser.ATOMICContext ctx) {
        return 1 / 0;
    }

    public Object visitRECURISVE_REF(ackParser.RECURISVE_REFContext ctx) {
        return 1 / 0;
    }

    private Object compare(final ackParser.ComparableContext leftComp, final ackParser.ComparableContext rightComp, BiFunction<BigDecimal, BigDecimal, Boolean> cc) {
        final SqlContext peek = sqlContextStack.peek();
        final Deque<TableData> tableDataStack = peek.tableData;
        final TableData tableData = tableDataStack.peek();
        final List<String> colNames = tableData.cols;
        tableData.rows = tableData.rows.stream().filter(
                x -> {
                    BigDecimal leftValue = getComparableValue(colNames, x, leftComp);
                    BigDecimal rightValue = getComparableValue(colNames, x, rightComp);
                    //字面量相等
                    return cc.apply(leftValue, rightValue);
                }
        ).collect(Collectors.toList());
        return null;
    }

    private BigDecimal getComparableValue(List<String> colNames, List<String> x, ackParser.ComparableContext leftComp1) {
        Object leftValue = null;
        if (leftComp1 instanceof ackParser.C_FIELDContext) {
            for (int i = 0; i < colNames.size(); i++) {
                final String colName = colNames.get(i);
                if (leftComp1.getText().equalsIgnoreCase(colName)) {
                    leftValue = x.get(i);
                    break;
                }
            }
        } else if (leftComp1 instanceof ackParser.P_INTContext) {
            leftValue = leftComp1.accept(this);
        } else {
            int i = 1 / 0;
        }
        if (leftValue instanceof BigDecimal) {
            return (BigDecimal) leftValue;
        } else {
            return new BigDecimal(String.valueOf(leftValue));
        }
    }

    private int getString(FieldDef leftFieldDef, List<String> lefTableDef) {
        for (int i = 0; i < lefTableDef.size(); i++) {
            if (leftFieldDef.fullPath().equalsIgnoreCase(lefTableDef.get(i))) {
                return i;
            }
        }
        return 1 / 0;
    }
}

class SqlContext {

    Deque<TableData> tableData = new LinkedList<>();
}


class TableData {
    List<List<String>> rows;
    List<String> cols;
    String name;

    public String toString() {
        return "TableData{" +
                "rows=" + rows +
                ", cols=" + cols +
                ", name='" + name + '\'' +
                '}';
    }
}

class TableDef {
    String engine;
    String table;

    public static TableDef parse(String str) {
        final TableDef tableDef = new TableDef();
        final String[] split = str.split("\\.");
        tableDef.engine = split[0];
        tableDef.table = split[1];
        return tableDef;
    }

    public String fullPath() {
        return engine + "." + table;
    }
}

class FieldDef {
    TableDef tableDef;
    String field;

    public static FieldDef parse(String str) {
        final FieldDef fieldDef = new FieldDef();
        fieldDef.tableDef = TableDef.parse(str);
        final String[] split = str.split("\\.");
        fieldDef.field = split[2];
        return fieldDef;
    }

    public String fullPath() {
        return tableDef.fullPath() + "." + field;
    }
}