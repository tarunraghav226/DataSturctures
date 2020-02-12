package simpleQueue;

import student.Student;

public class SimpleQueue {
    private Student students[];
    private int top;
    private int beginning;
    private int size;

    public SimpleQueue(int size) {
        this.size = size;
        top = -1;
        beginning = -1;
        students = new Student[size];
    }

    public void enQueue(Student student) {
        if (beginning == -1 && top == -1) {
            top = 0;
            beginning = 0;
            students[top] = student;
        } else if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            students[top] = student;
        }
    }

    public void deQueue() {
        if (top == -1 && beginning == -1) {
            System.out.println("Underflow");
        } else if (top == beginning) {
            System.out.println(students[beginning]);
            top = -1;
            beginning = -1;
        } else {
            System.out.println(students[beginning]);
            beginning++;
        }
    }

    public void peekInQueue() {
        if (top == -1 && beginning == -1) {
            System.out.println("No elements");
        } else {
            for (int i = beginning; i <= top; i++)
                System.out.println(students[i]);
        }
    }

    public boolean isEmpty() {
        return top == size - 1;
    }
}
