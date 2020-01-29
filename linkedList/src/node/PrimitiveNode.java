package node;

public class PrimitiveNode {
    int data;
    PrimitiveNode next;

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

    @Override
    public String toString() {
        return "Data --> " + getData() + "\n" +
                "Next Reference --> " + getNext().hashCode();
    }
}
