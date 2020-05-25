import graph.WeightedGraph;
import queue.PriorityQ;

public class WeightedMain {
    public static void main(String[] args) {
        PriorityQ q;

        WeightedGraph weightedGraph = new WeightedGraph();
        weightedGraph.addVertex('A');
        weightedGraph.addVertex('B');
        weightedGraph.addVertex('C');
        weightedGraph.addVertex('D');
        weightedGraph.addVertex('E');
        weightedGraph.addVertex('F');
        weightedGraph.addVertex('G');

        weightedGraph.addEdge(0, 1, 7);
        weightedGraph.addEdge(1, 4, 3);
        weightedGraph.addEdge(4, 6, 9);
        weightedGraph.addEdge(6, 5, 11);
        weightedGraph.addEdge(0, 2, 6);
        weightedGraph.addEdge(2, 4, 10);
        weightedGraph.addEdge(2, 6, 1);
        weightedGraph.addEdge(2, 3, 2);

        System.out.println("-----MST-----");
        weightedGraph.mst();
    }
}
