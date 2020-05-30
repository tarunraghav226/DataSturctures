package dijkstra;

import vertex.Vertex;

public class Graph {
    private final int INFINITY = 10000000;
    private int MAX_VERT = 20;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int startToCurrent;
    private int currentVert;
    private DistPar[] sPath;
    private int nVert;
    private int nTree;

    public Graph() {
        vertexList = new Vertex[MAX_VERT];
        adjMat = new int[MAX_VERT][MAX_VERT];
        sPath = new DistPar[MAX_VERT];
        nTree = 0;
        nVert = 0;

        for (int i = 0; i < MAX_VERT; i++)
            for (int j = 0; j < MAX_VERT; j++)
                adjMat[i][j] = INFINITY;
    }

    public void addVert(char label) {
        if (nVert == MAX_VERT)
            return;
        vertexList[nVert++] = new Vertex(label);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
        adjMat[end][start] = weight;
    }

    public void path() {
        int startTree = 0;
        vertexList[0].isVisited = true;
        nTree++;

        for (int j = 0; j < nVert; j++) {
            int tempDist = adjMat[startTree][j];
            sPath[j] = new DistPar(startTree, tempDist);
        }

        while (nTree < nVert) {
            int minIndex = getMin();
            int distance = sPath[minIndex].distance;

            if (distance == INFINITY) {
                System.out.println("Unreachable Vertices");
                break;
            } else {
                currentVert = minIndex;
                startToCurrent = sPath[minIndex].distance;
            }

            vertexList[currentVert].isVisited = true;
            nTree++;
            adjust_sPath();
        }

        displayPaths();

        nTree = 0;
        for (int i = 0; i < nVert; i++)
            vertexList[i].isVisited = false;
    }

    private int getMin() {
        int minDistance = INFINITY;
        int minIndex = 0;
        for (int i = 1; i < nVert; i++) {
            if (!vertexList[i].isVisited && sPath[i].distance < minDistance) {
                minDistance = sPath[i].distance;
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void adjust_sPath() {
        int column = 1;
        while (column < nVert) {
            if (vertexList[column].isVisited) {
                column++;
                continue;
            }

            int currentToFringe = adjMat[currentVert][column];
            int startToFringe = startToCurrent + currentToFringe;
            int sPathDist = sPath[column].distance;
            if (sPathDist > startToFringe) {
                sPath[column].parent = currentVert;
                sPath[column].distance = startToFringe;
            }
            column++;
        }
    }

    private void displayPaths() {
        for (int j = 0; j < nVert; j++) {
            System.out.print(vertexList[j].label + "=");
            if (sPath[j].distance == INFINITY)
                System.out.print("inf");
            else
                System.out.print(sPath[j].distance);
            char parent = vertexList[sPath[j].parent].label;
            System.out.print("(" + parent + ") ");
        }
        System.out.println("");
    }


}
