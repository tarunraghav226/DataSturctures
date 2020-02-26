package node;

import student.Student;

public class DoublyLinkedNode {
    private Student student;
    private DoublyLinkedNode previous;
    private DoublyLinkedNode next;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public DoublyLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedNode previous) {
        this.previous = previous;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoublyLinkedNode{" +
                "student=" + student +
                '}';
    }
}
