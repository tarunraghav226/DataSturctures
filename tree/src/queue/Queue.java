package queue;

import node.Node;
import student.Student;

public class Queue {

    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enQueue(Student student) {
        Node node = new Node();
        node.setStudent(student);
        if (front == null && rear == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
    }

    public Student deQueue() {
        Student student = new Student();
        if (front == null && rear == null)
            System.out.println("Underflow");
        else {
            student = front.getStudent();
            front = front.getNext();
        }
        return student;
    }
}
