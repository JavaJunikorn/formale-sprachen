package de.thl.fs.listener;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class RunListener {
    public static void main(String[] args) throws IOException {
        CharStream input = null;
        input = new ANTLRFileStream(args[0]);
        ListenerLexer lexer = new ListenerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ListenerParser parser = new ListenerParser(tokens);
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListener listener = new EvalListener();
        walker.walk(listener,tree);
        System.out.println("Result: " + listener.getValue(tree));
        System.out.println("Tree: " + tree.toStringTree(parser));
    }
}
