// Generated from /Users/guoyangqiao/Projects/java/antlr4-test/src/main/resources/ack.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ackParser}.
 */
public interface ackListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ackParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ackParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ackParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ackParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExp(ackParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExp(ackParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ackParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ackParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ackParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ackParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ackParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect(ackParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect(ackParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(ackParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(ackParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ackParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ackParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ackParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ackParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitHttp}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVisitHttp(ackParser.VisitHttpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitHttp}
	 * labeled alternative in {@link ackParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVisitHttp(ackParser.VisitHttpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ackParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(ackParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ackParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(ackParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ackParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(ackParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ackParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(ackParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FROM_BASIC}
	 * labeled alternative in {@link ackParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFROM_BASIC(ackParser.FROM_BASICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FROM_BASIC}
	 * labeled alternative in {@link ackParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFROM_BASIC(ackParser.FROM_BASICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FROM_JOIN}
	 * labeled alternative in {@link ackParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFROM_JOIN(ackParser.FROM_JOINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FROM_JOIN}
	 * labeled alternative in {@link ackParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFROM_JOIN(ackParser.FROM_JOINContext ctx);
	/**
	 * Enter a parse tree produced by {@link ackParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(ackParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ackParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(ackParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterEQ(ackParser.EQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitEQ(ackParser.EQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEQ}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterNEQ(ackParser.NEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEQ}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitNEQ(ackParser.NEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GT}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterGT(ackParser.GTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitGT(ackParser.GTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LT}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterLT(ackParser.LTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link ackParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitLT(ackParser.LTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code C_FIELD}
	 * labeled alternative in {@link ackParser#comparable}.
	 * @param ctx the parse tree
	 */
	void enterC_FIELD(ackParser.C_FIELDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code C_FIELD}
	 * labeled alternative in {@link ackParser#comparable}.
	 * @param ctx the parse tree
	 */
	void exitC_FIELD(ackParser.C_FIELDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code P_INT}
	 * labeled alternative in {@link ackParser#comparable}.
	 * @param ctx the parse tree
	 */
	void enterP_INT(ackParser.P_INTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code P_INT}
	 * labeled alternative in {@link ackParser#comparable}.
	 * @param ctx the parse tree
	 */
	void exitP_INT(ackParser.P_INTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATOMIC}
	 * labeled alternative in {@link ackParser#field}.
	 * @param ctx the parse tree
	 */
	void enterATOMIC(ackParser.ATOMICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATOMIC}
	 * labeled alternative in {@link ackParser#field}.
	 * @param ctx the parse tree
	 */
	void exitATOMIC(ackParser.ATOMICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RECURISVE_REF}
	 * labeled alternative in {@link ackParser#field}.
	 * @param ctx the parse tree
	 */
	void enterRECURISVE_REF(ackParser.RECURISVE_REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RECURISVE_REF}
	 * labeled alternative in {@link ackParser#field}.
	 * @param ctx the parse tree
	 */
	void exitRECURISVE_REF(ackParser.RECURISVE_REFContext ctx);
}