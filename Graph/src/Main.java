import graph.Graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('R');
        graph.addVertex('T');
        graph.addVertex('A');
        graph.addVertex('U');
        graph.addVertex('N');

        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 2);
        graph.addEdge(4, 2);

        graph.DFSSearch();
    }
}
