package graph;

import edge.Edge;
import queue.PriorityQ;
import vertex.Vertex;

public class WeightedGraph {
    private final int MAX_VERT = 20;
    private final int INFINITY = Integer.MAX_VALUE;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int currentVert;
    private int nTree;
    private int nVert;
    private PriorityQ priorityQ;

    public WeightedGraph() {
        vertexList = new Vertex[MAX_VERT];
        adjMat = new int[MAX_VERT][MAX_VERT];
        nVert = 0;
        priorityQ = new PriorityQ();
        for (int i = 0; i < MAX_VERT; i++)
            for (int j = 0; j < MAX_VERT; j++)
                adjMat[i][j] = INFINITY;
    }

    public void addVertex(char label) {
        vertexList[nVert++] = new Vertex(label);
    }

    public void addEdge(int start, int end, int distance) {
        adjMat[start][end] = distance;
        adjMat[end][start] = distance;
    }

    public void displayVertex(int n) {
        System.out.println(vertexList[n].label);
    }

    public void mst() {
        currentVert = 0;
        while (nTree < nVert - 1) {
            vertexList[currentVert].isVisited = true;
            nTree++;
            for (int i = 0; i < nVert; i++) {
                if (i == currentVert)
                    continue;
                if (vertexList[i].isVisited)
                    continue;
                int distance = adjMat[currentVert][i];
                if (distance == INFINITY)
                    continue;
                putInQ(i, distance);
            }
            if (priorityQ.getSize() == 0) {
                System.out.println("Graph not connected");
                return;
            }
            Edge edge = priorityQ.removeMin();
            int source = edge.srcVert;
            currentVert = edge.destVert;
            System.out.print("-----------------------\nFrom --> ");
            displayVertex(source);
            System.out.print("To --> ");
            displayVertex(currentVert);
            System.out.println("-----------------------");
        }

        for (int i = 0; i < nVert; i++)
            vertexList[i].isVisited = false;
    }

    public void putInQ(int dest, int distance) {
        int v = priorityQ.find(dest);
        if (v == -1) {
            priorityQ.insert(new Edge(currentVert, dest, distance));
        } else {
            Edge tempEdge = priorityQ.peekN(v);
            if (distance < tempEdge.distance) {
                priorityQ.removeN(v);
                priorityQ.insert(new Edge(currentVert, dest, distance));
            }
        }
    }
}
