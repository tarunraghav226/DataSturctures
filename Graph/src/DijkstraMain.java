import dijkstra.Graph;

public class DijkstraMain {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVert('A');
        theGraph.addVert('C');
        theGraph.addVert('B');
        theGraph.addVert('D');
        theGraph.addVert('E');

        theGraph.addEdge(0, 1, 50);
        theGraph.addEdge(0, 3, 80);
        theGraph.addEdge(1, 2, 60);
        theGraph.addEdge(1, 3, 90);
        theGraph.addEdge(2, 4, 40);
        theGraph.addEdge(3, 2, 20);
        theGraph.addEdge(3, 4, 70);
        theGraph.addEdge(4, 1, 50);

        theGraph.path();
    }
}
