package vertex;

public class Vertex {
    public char label;
    public boolean isVisited; // isInTree in case of weighted graph

    public Vertex(char label) {
        this.label = label;
        isVisited = false;
    }

    @Override
    public String toString() {
        return "Label --> " + this.label;
    }
}
