import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        STGroup templates = new STGroupFile("./aufgabe5/src/main/java/Dot.stg");
        ST st = templates.getInstanceOf("dot");

        CharStream input = null;
        input = new ANTLRFileStream(args[0]);
        CymLexer lexer = new CymLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymParser parser = new CymParser(tokens);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
        st.add("nodesG", collector.graph.nodesEnd);
        st.add("edgesG",collector.graph.edgesEnd);
        st.add("nodesR", collector.graph.nodesN);
        st.add("edgesR",collector.graph.edgesN);
        st.add("edges", collector.graph.edges);
        st.add("nodes", collector.graph.nodes);
        System.out.println(collector.graph.edgesEnd.size());
        collector.graph.writeFile(st.render());
        System.out.println(st.render());
    }

}
