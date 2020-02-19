package priorityQueue;

import node.PriorityNode;

public class ArrayPriorityQueue {

    private int front;
    private int rear;
    private PriorityNode[] array;

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    @Override
    public String toString() {
        return "ArrayPriorityQueue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
