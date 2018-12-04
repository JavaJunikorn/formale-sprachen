// Generated from C:/Users/CRhod_000/IdeaProjects/FormaleSprachen/Aufgabe4/src/main/java/de/thl/fs/listener\Listener.g4 by ANTLR 4.7
package de.thl.fs.listener;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ListenerParser}.
 */
public interface ListenerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ListenerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ListenerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListenerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ListenerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link ListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ListenerParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link ListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ListenerParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ListenerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ListenerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Blank}
	 * labeled alternative in {@link ListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ListenerParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Blank}
	 * labeled alternative in {@link ListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ListenerParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTDIV}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULTDIV(ListenerParser.MULTDIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTDIV}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULTDIV(ListenerParser.MULTDIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pot}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPot(ListenerParser.PotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pot}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPot(ListenerParser.PotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUB}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADDSUB(ListenerParser.ADDSUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUB}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADDSUB(ListenerParser.ADDSUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(ListenerParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(ListenerParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLAMS}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCLAMS(ListenerParser.CLAMSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLAMS}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCLAMS(ListenerParser.CLAMSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ltd}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtd(ListenerParser.LtdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ltd}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtd(ListenerParser.LtdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INT}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterINT(ListenerParser.INTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INT}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitINT(ListenerParser.INTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComp(ListenerParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link ListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComp(ListenerParser.CompContext ctx);
}