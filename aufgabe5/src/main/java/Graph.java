import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class Graph {
    Set<String> nodesEnd = new OrderedHashSet<String>();
    Set<String> nodesN = new OrderedHashSet<String>();
    Set<String> nodes = new OrderedHashSet<String>();
    MultiMap<String,String> edges = new MultiMap<String,String>();
    MultiMap<String, String> edgesEnd = new MultiMap<String, String>();
    MultiMap<String, String> edgesN = new MultiMap<String, String>();

    public void edge(String source, String target) {
        edges.map(source, target);
    }

    public void edgeEnd(String source, String target) {
        edgesEnd.map(source, target);
    }

    public void edgeN(String source, String target) {
        edgesN.map(source, target);
    }

    public void writeFile(String str) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("./aufgabe5/src/main/resources/dot.puml"));
        writer.write(str);
        writer.close();
    }
}
