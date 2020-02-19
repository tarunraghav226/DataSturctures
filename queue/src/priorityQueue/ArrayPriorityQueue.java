package priorityQueue;

import node.PriorityNode;

public class ArrayPriorityQueue {

    private int front;
    private int rear;
    private PriorityNode[] array;

    public ArrayPriorityQueue(int size) {
        front = -1;
        rear = -1;
        array = new PriorityNode[size];
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
        int i;
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            array[rear] = newNode;
        } else if (rear == array.length - 1) {
            System.out.println("Overflow");
            return;
        } else {
            for (i = rear; i >= front; i--) {
                if (array[i].getPriority() > newNode.getPriority()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = newNode;
            System.out.println("Entered -- " + array[i + 1]);
            rear++;
        }
    }

    public PriorityNode deQueue() {
        PriorityNode temp = new PriorityNode();
        if (rear == -1 && front == -1) {
            System.out.println("Underflow");
            return null;
        } else if (front == rear) {
            temp = array[front];
            front = -1;
            rear = -1;
        } else {
            temp = array[front];
            front++;
        }
        System.out.println("Deleted -- " + temp);
        return temp;
    }

    public PriorityNode peek() {
        return array[front];
    }

    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
