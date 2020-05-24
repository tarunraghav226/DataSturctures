package edge;

public class Edge {
    private int srcVert;
    private int destVert;
    private int distance;

    public Edge(int srcVert, int destVert, int distance) {
        this.srcVert = srcVert;
        this.destVert = destVert;
        this.distance = distance;
    }
}
