// Generated from C:/Users/CRhod_000/IdeaProjects/FormaleSprachen/Aufgabe5/src/main/java\Cym.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymParser}.
 */
public interface CymListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CymParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CymParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notReturn}
	 * labeled alternative in {@link CymParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNotReturn(CymParser.NotReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notReturn}
	 * labeled alternative in {@link CymParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNotReturn(CymParser.NotReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CymParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CymParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonCallGraphExpr}
	 * labeled alternative in {@link CymParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNonCallGraphExpr(CymParser.NonCallGraphExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonCallGraphExpr}
	 * labeled alternative in {@link CymParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNonCallGraphExpr(CymParser.NonCallGraphExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallGraphExpr}
	 * labeled alternative in {@link CymParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallGraphExpr(CymParser.CallGraphExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallGraphExpr}
	 * labeled alternative in {@link CymParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallGraphExpr(CymParser.CallGraphExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymParser.ExprListContext ctx);
}