import de.thl.fs.actions.ActionsLexer;
import de.thl.fs.actions.ActionsParser;
import de.thl.fs.listener.EvalListener;
import de.thl.fs.listener.ListenerLexer;
import de.thl.fs.listener.ListenerParser;
import de.thl.fs.visitor.EvalVisitor;
import de.thl.fs.visitor.ExprLexer;
import de.thl.fs.visitor.ExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testVisitor() throws IOException {
        Integer test = setUpVisitor("2+3*5");
        assertEquals(17,test.intValue());
        test = setUpVisitor("5+7");
        assertEquals(12,test.intValue());
        test = setUpVisitor("(3+4)*2");
        assertEquals(14,test.intValue());
        test = setUpVisitor("(5+2*2)^2");
        assertEquals(81,test.intValue());
        test = setUpVisitor("1<3");
        assertEquals(1,test.intValue());
        test = setUpVisitor("2<1?1:0"); //\nclear
        assertEquals(0,test.intValue());
    }

    private Integer setUpVisitor(String expression){
        CharStream input = CharStreams.fromString(expression);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        return eval.visit(tree);
    }

    @Test
    public void testListener() throws IOException {
        Integer test = setUpListener("2+3*5");
        assertEquals(17,test.intValue());
        test = setUpListener("5+7");
        assertEquals(12,test.intValue());
        test = setUpListener("(3+4)*2");
        assertEquals(14,test.intValue());
        test = setUpListener("(5+2*2)^2");
        assertEquals(81,test.intValue());
        test = setUpListener("3==3");
        assertEquals(1,test.intValue());
        test = setUpListener("3<3?1:0");
        assertEquals(0,test.intValue());
    }

    private Integer setUpListener(String expression){
        CharStream input = CharStreams.fromString(expression);
        ListenerLexer lexer = new ListenerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ListenerParser parser = new ListenerParser(tokens);
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListener eval = new EvalListener();
        walker.walk(eval,tree);
        return eval.getValue(tree);
    }

    @Test
    public void testActions() throws IOException {
        ActionsParser parser = setUpParser("2+3*5");
        assertEquals(17, parser.expr().value);
        parser = setUpParser("5+7");
        assertEquals(12, parser.expr().value);
        parser = setUpParser("(3+4)*2");
        assertEquals(14, parser.expr().value);
        parser = setUpParser("(5+2*2)^2");
        assertEquals(81, parser.expr().value);
        parser = setUpParser("3==3");
        assertEquals(1, parser.expr().value);
        parser = setUpParser("5<10?1:0");
        assertEquals(1, parser.expr().value);
        parser = setUpParser("if(3==3)5 else2");
        assertEquals(5, parser.expr().value);
    }

    private ActionsParser setUpParser(String expression){
        CharStream input = CharStreams.fromString(expression);
        ActionsLexer lexer = new ActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ActionsParser parser = new ActionsParser(tokens);
        parser.setBuildParseTree(false);
        return parser;
    }
}
