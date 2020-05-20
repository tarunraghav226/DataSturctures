package graph;

import vertex.Vertex;

public class Graph {
    private final int MAX_VERTEX = 20;
    int numberOfVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMat;

    public Graph() {
        vertexList = new Vertex[this.MAX_VERTEX];
        adjacencyMat = new int[this.MAX_VERTEX][this.MAX_VERTEX];
        numberOfVertex = 0;
    }

    public boolean addVertex(char label) {
        if (numberOfVertex >= MAX_VERTEX)
            return false;
        vertexList[numberOfVertex++] = new Vertex(label);
        return true;
    }

    public void addEdge(int start, int end) {
        adjacencyMat[start][end] = 1;
        adjacencyMat[end][start] = 1;
    }

    public void displayVertex(int k) {
        System.out.println(vertexList[k]);
    }

}
