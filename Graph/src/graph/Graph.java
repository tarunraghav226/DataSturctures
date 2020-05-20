package graph;

import vertex.Vertex;

import java.util.Stack;

public class Graph {
    private final int MAX_VERTEX = 20;
    int numberOfVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMat;
    private Stack<Integer> stack;

    public Graph() {
        vertexList = new Vertex[this.MAX_VERTEX];
        adjacencyMat = new int[this.MAX_VERTEX][this.MAX_VERTEX];
        numberOfVertex = 0;
        stack = new Stack<>();
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

    private int getUnvisitedVertex(int v) {
        for (int j = 0; j < MAX_VERTEX; j++) {
            if (adjacencyMat[v][j] == 1 && vertexList[j].isVisited == false)
                return j;
        }
        return -1;
    }

    public void DFSSearch() {
        vertexList[0].isVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitedVertex(stack.peek());
            if (v == -1)
                stack.pop();
            else {
                vertexList[v].isVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }

        for (int j = 0; j < vertexList.length; j++) {
            vertexList[j].isVisited = false;
        }
    }
}
