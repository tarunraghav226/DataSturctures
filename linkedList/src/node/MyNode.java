package node;

import student.Student;

public class MyNode {
    Student student;
    MyNode next;

    private Student getStudent() {
        return student;
    }

    private void setStudent(Student student) {
        this.student = student;
    }

    private MyNode getNext() {
        return next;
    }

    private void setNext(MyNode next) {
        this.next = next;
    }

    public void setNode(Student student, MyNode nextNode) {
        this.setStudent(student);
        this.setNext(nextNode);
    }

    @Override
    public String toString() {
        return this.student.toString() + "\n" +
                "Next Reference --> " + this.getNext();
    }
}
