package node;

public class PrimitiveNode {
    int data;
    PrimitiveNode next;

    public PrimitiveNode() {
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public PrimitiveNode getNext() {
        return next;
    }

    public void setNext(PrimitiveNode next) {
        this.next = next;
    }

    public void setNode(int data, PrimitiveNode nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    @Override
    public String toString() {
        return "Data --> " + getData() + "\n";
    }
}
