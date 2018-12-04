// Generated from C:/Users/CRhod_000/IdeaProjects/FormaleSprachen/Aufgabe4/src/main/java/de/thl/fs/actions\Actions.g4 by ANTLR 4.7
package de.thl.fs.actions;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActionsParser}.
 */
public interface ActionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ActionsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ActionsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ActionsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ActionsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ActionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ActionsParser.ExprContext ctx);
}