package vertex;

public class Vertex {
    public char label;
    public boolean isVisited;

    public Vertex(char label) {
        this.label = label;
        isVisited = false;
    }

    @Override
    public String toString() {
        return "Label --> " + this.label + "Visited --> " + this.isVisited;
    }
}
