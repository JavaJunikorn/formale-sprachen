package de.thl.fs.visitor;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class RunVisitor {
    public static void main(String[] args) throws IOException {
        CharStream input = null;
        input = new ANTLRFileStream(args[0]);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        System.out.println("Result: "+ eval.visit(tree));
        System.out.println("Tree: " + tree.toStringTree(parser));
    }
}
