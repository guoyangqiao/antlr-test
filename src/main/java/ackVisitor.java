// Generated from /Users/guoyangqiao/Projects/java/antlr4-test/src/main/resources/ack.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ackParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ackVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ackParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ackParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ackParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ackParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ackParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(ackParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ackParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ackParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ackParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitHttp}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitHttp(ackParser.VisitHttpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ackParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(ackParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ackParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(ackParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FROM_BASIC}
	 * labeled alternative in {@link ackParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFROM_BASIC(ackParser.FROM_BASICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FROM_JOIN}
	 * labeled alternative in {@link ackParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFROM_JOIN(ackParser.FROM_JOINContext ctx);
	/**
	 * Visit a parse tree produced by {@link ackParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(ackParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQ(ackParser.EQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEQ}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEQ(ackParser.NEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGT(ackParser.GTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLT(ackParser.LTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code C_FIELD}
	 * labeled alternative in {@link ackParser#comparable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_FIELD(ackParser.C_FIELDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code P_INT}
	 * labeled alternative in {@link ackParser#comparable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_INT(ackParser.P_INTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATOMIC}
	 * labeled alternative in {@link ackParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATOMIC(ackParser.ATOMICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RECURISVE_REF}
	 * labeled alternative in {@link ackParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRECURISVE_REF(ackParser.RECURISVE_REFContext ctx);
}