package priorityQueue;

import node.PriorityNode;

public class SimplePriorityQueue {

    private PriorityNode front;
    private PriorityNode rear;

    public PriorityNode getFront() {
        return front;
    }

    public void setFront(PriorityNode front) {
        this.front = front;
    }

    public PriorityNode getRear() {
        return rear;
    }

    public void setRear(PriorityNode rear) {
        this.rear = rear;
    }

    @Override
    public String toString() {
        return "SimplePriorityQueue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
