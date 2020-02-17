package linkedQueue;

import node.Node;

public class LinkedQueue {

    private Node top;
    private Node beginning;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public Node getBeginning() {
        return beginning;
    }

    public void setBeginning(Node beginning) {
        this.beginning = beginning;
    }

    public void enQueue(Node node) {
        if (top == null && beginning == null) {
            top = node;
            beginning = node;
        } else {
            top.setNext(node);
            top = top.getNext();
        }
    }

    public Node deQueue() {
        if (top == null && beginning == null) {
            return null;
        }
        if (top == beginning) {
            Node temp = beginning;
            beginning = null;
            top = null;
            return temp;
        } else {
            Node temp = beginning;
            beginning = beginning.getNext();
            return temp;
        }
    }

    public Node peekInQueue() {
        return beginning;
    }
}
