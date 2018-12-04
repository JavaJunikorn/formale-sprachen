import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class FunctionListener extends CymBaseListener {
    Graph graph = new Graph();
    String currentFunctionName = null;

    @Override
    public void enterFunctionDecl(CymParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
    }

    @Override
    public void exitCallGraphExpr(CymParser.CallGraphExprContext ctx) {
        String funcName = ctx.ID().getText();
        if (currentFunctionName.equals(funcName)) {
            if (ctx.getParent() instanceof CymParser.ReturnContext) {
                graph.edgeEnd(currentFunctionName, funcName);
                graph.nodesEnd.add(currentFunctionName);
            } else {
                graph.edgeN(currentFunctionName, funcName);
                graph.nodesN.add(currentFunctionName);
            }
        }
        else {
            graph.edge(currentFunctionName,funcName);
            graph.nodes.add(currentFunctionName);
        }
    }
}
