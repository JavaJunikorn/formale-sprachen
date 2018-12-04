package de.thl.fs.listener;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class EvalListener extends ListenerBaseListener {
    ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();
    Map<String, Integer> memory = new HashMap<String, Integer>();

    public void setValue(ParseTree node, int value){
        values.put(node, value);
    }

    public int getValue(ParseTree node){
        return values.get(node);
    }

    @Override
    public void exitLtd(ListenerParser.LtdContext ctx) {
        int value = getValue(ctx.expr(0));
        int result = -1;
        if(value == 1) result = getValue(ctx.expr(1));
        else result = getValue(ctx.expr(2));
        setValue(ctx,result);

    }

    @Override
    public void exitProg(ListenerParser.ProgContext ctx) {
        setValue(ctx, getValue(ctx.stat(0)));
    }

    @Override
    public void exitPrintExpr(ListenerParser.PrintExprContext ctx) {
        Integer value = getValue(ctx.expr());
        setValue(ctx, value);
        //System.out.println("Print: " + value);
    }

    @Override
    public void exitAssign(ListenerParser.AssignContext ctx) {
        Integer value = getValue(ctx.expr()); // get the value from next expression
        //System.out.println(value);
        String id = ctx.ID().getText();
        if(id == "clear") {
            for(Integer v : memory.values())  // T durch die Klasse ersetzen, aus denen die Werte bestehen
            {
                v =0;
            }
            value=0;
        }
        else {
            setValue(ctx, value);
            memory.put(id, value);
        }
    }

    @Override
    public void exitPot(ListenerParser.PotContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, (int)Math.pow(left, right));
    }

    @Override
    public void exitMULTDIV(ListenerParser.MULTDIVContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        if ( ctx.op.getType() == 3 ){
            setValue(ctx, left*right);
        }
        else {
            setValue(ctx, left/right);
        }
    }

    @Override
    public void exitComp(ListenerParser.CompContext ctx) {
        int left = getValue(ctx.expr(0)); // get value of left subexpression
        int right = getValue(ctx.expr(1)); // get value of right subexpression
        int result = -1;
        if(ctx.op.getType() == 7) setValue(ctx,left == right ? 1 : 0);
        else if(ctx.op.getType() == 8) setValue(ctx,left < right ? 1 : 0);
        else setValue(ctx,left > right ? 1 : 0);

    }

    @Override
    public void exitADDSUB(ListenerParser.ADDSUBContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        if ( ctx.op.getType() == 5 ) {
           setValue(ctx, left+right);
        }
        else {
            setValue(ctx, left-right);
        }
    }

    @Override
    public void exitID(ListenerParser.IDContext ctx) {
        String id = ctx.ID().getText();
        if(memory.containsKey(id)) setValue(ctx, memory.get(id));
    }

    @Override
    public void exitCLAMS(ListenerParser.CLAMSContext ctx) {
        int expression = getValue(ctx.expr());
        setValue(ctx, expression);
    }

    @Override
    public void exitINT(ListenerParser.INTContext ctx) {
        String intText = ctx.INT().getText();
        setValue(ctx, Integer.valueOf(intText));
    }
}
