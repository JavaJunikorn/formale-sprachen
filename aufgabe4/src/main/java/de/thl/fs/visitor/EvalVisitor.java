package de.thl.fs.visitor;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends ExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();


    @Override
    public Integer visitProg(ExprParser.ProgContext ctx) {
        Integer value = visit(ctx.stat(0));
        return value;
    }

    @Override
    public Integer visitPrintExpr(ExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr());
        //System.out.println(value);
        return value;
    }

    @Override
    public Integer visitAssign(ExprParser.AssignContext ctx) {
        Integer value = visit(ctx.expr()); // get the value from next expression
        String id = ctx.ID().getText();
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitBlank(ExprParser.BlankContext ctx) {
        return super.visitBlank(ctx);
    }

    @Override
    public Integer visitPot(ExprParser.PotContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return (int)Math.pow(left, right);
    }

    @Override
    public Integer visitComp(ExprParser.CompContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        int result = -1;
        if(ctx.op.getType() == 7) result = left == right ? 1 : 0;
        else if(ctx.op.getType() == 8) result = left < right ? 1 : 0;
        else result = left > right ? 1 : 0;

        return result;
    }

    @Override
    public Integer visitLtd(ExprParser.LtdContext ctx) {
        int value = visit(ctx.expr(0));
        int result = -1;
        if(value == 1) result = visit(ctx.expr(1));
        else result = visit(ctx.expr(2));
        return result;
    }

    @Override
    public Integer visitAddSub(ExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == 5 ) return left + right; //4 is ADD
        return left-right; // must be SUB
    }

    @Override
    public Integer visitID(ExprParser.IDContext ctx) {
        String id = ctx.ID().getText();
        if(id == "clear") memory.clear();
        else if(memory.containsKey(id)) return memory.get(id);
        return 0;
    }

    @Override
    public Integer visitClams(ExprParser.ClamsContext ctx) {
        Integer value = visit(ctx.expr()); // get value of expression underneath
        return value;
    }

    @Override
    public Integer visitINT(ExprParser.INTContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitMultDiv(ExprParser.MultDivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == 3 ) return left * right; // 2 is MULT
        return left/right; // must be DIV
    }
}
