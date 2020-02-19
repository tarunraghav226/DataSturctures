package priorityQueue;

import node.PriorityNode;

public class ArrayPriorityQueue {

    private int front;
    private int rear;
    private PriorityNode[] array;

    public ArrayPriorityQueue() {
        front = -1;
        rear = -1;
    }

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

    public void enQueue(PriorityNode newNode) {
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            array[rear] = newNode;
        } else if (rear == array.length - 1) {
            System.out.println("Overflow");
        } else {
            rear++;
            array[rear] = newNode;
        }
    }
}
