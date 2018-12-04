package de.thl.fs.actions;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class RunActions {
    public static void main(String[] args) throws IOException {
        CharStream input = null;
        input = new ANTLRFileStream(args[0]);
        ActionsLexer lexer = new ActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ActionsParser parser = new ActionsParser(tokens);
        parser.setBuildParseTree(false);
        parser.prog();
    }
}
