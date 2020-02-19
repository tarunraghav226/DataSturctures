package priorityQueue;

import node.PriorityNode;

public class LinkedPriorityQueue {

    private PriorityNode front;

    public PriorityNode getFront() {
        return front;
    }

    public void setFront(PriorityNode front) {
        this.front = front;
    }

    @Override
    public String toString() {
        return "SimplePriorityQueue{" +
                "front=" + front +
                '}';
    }

    public void enQueue(PriorityNode newNode) {
        PriorityNode temp = front;
        if (front == null || front.getPriority() >= newNode.getPriority()) {
            front = newNode;
            newNode.setNext(temp);
        } else {
            while (temp.getNext() != null && temp.getNext().getPriority() <= newNode.getPriority()) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }

    public PriorityNode deQueue() {
        PriorityNode temp = null;
        if (front == null) {
            System.out.println("Underflow");
            temp = null;
        } else {
            temp = front;
            front = front.getNext();
        }
        return temp;
    }
}
