package circularQueue;

import student.Student;

public class CircularQueue {
    private int top;
    private int beginning;
    private Student[] students;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        students = new Student[this.getSize()];
        top = -1;
        beginning = -1;
    }

    public int getSize() {
        return this.size;
    }

    public void enEqueue(Student student) {
        if ((beginning == 0 && top == size - 1) || top + 1 == beginning) {
            System.out.println("!!! Overflow !!!");
        } else if (top == -1 && beginning == -1) {
            top = 0;
            beginning = 0;
            students[top] = student;
        } else if (beginning > 0 && (top + 1) % size != beginning) {
            top = (top + 1) % size;
            students[top] = student;
        } else {
            top++;
            students[top] = student;
        }
    }

    public void deQueue() {
        if (top == -1 && beginning == -1) {
            System.out.println("!!! Underflow !!!");
        } else if (top == beginning) {
            System.out.println("Deleted data ---> " + students[beginning]);
            beginning = -1;
            top = -1;
        } else {
            System.out.println("Deleted data ---> " + students[beginning]);
            beginning = (beginning + 1) % 4;
        }
    }

    public void peekInQueue() {
        if (top == -1 && beginning == -1) {
            System.out.println("No Element");
        } else if (top >= beginning) {
            for (int i = beginning; i <= top; i++)
                System.out.println("Peek Data ---> " + students[i]);
        } else if (top < beginning) {
            for (int i = beginning; i < getSize(); i++) {
                System.out.println("Peek Data ---> " + students[i]);
            }
            for (int i = 0; i <= top; i++) {
                System.out.println("Peek Data ---> " + students[i]);
            }
        }
    }
}
