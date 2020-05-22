package graph;

import vertex.Vertex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final int MAX_VERTEX = 20;
    int numberOfVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMat;
    private Stack<Integer> stack;
    private Queue<Integer> queue;

    public Graph() {
        vertexList = new Vertex[this.MAX_VERTEX];
        adjacencyMat = new int[this.MAX_VERTEX][this.MAX_VERTEX];
        numberOfVertex = 0;
        stack = new Stack<>();
        queue = new LinkedList<>();
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

    public void DFSearch() {
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

        for (int j = 0; j < numberOfVertex; j++) {
            vertexList[j].isVisited = false;
        }
    }

    public void BFSearch() {
        vertexList[0].isVisited = true;
        displayVertex(0);
        queue.add(0);
        int v2;
        while (!queue.isEmpty()) {
            int v1 = queue.remove();
            while ((v2 = getUnvisitedVertex(v1)) != -1) {
                vertexList[v2].isVisited = true;
                displayVertex(v2);
                queue.add(v2);
            }
        }

        for (int i = 0; i < numberOfVertex; i++) {
            vertexList[i].isVisited = false;
        }
    }

    public void mst() {
        vertexList[0].isVisited = true;
        stack.push(0);
        while (!stack.isEmpty()) {
            int currentVertex = stack.peek();
            int v = getUnvisitedVertex(currentVertex);
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].isVisited = true;
                displayVertex(currentVertex);
                displayVertex(v);
                System.out.println("-----------------");
                stack.push(v);
            }
        }
        for (int i = 0; i < numberOfVertex; i++) {
            vertexList[i].isVisited = true;
        }
    }
}
