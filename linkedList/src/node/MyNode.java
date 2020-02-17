package node;

import student.Student;

public class MyNode {
    Student student;
    MyNode next;

    public Student getStudent() {
        return student;
    }

    private void setStudent(Student student) {
        this.student = student;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode nextNode) {
        this.next = nextNode;
    }

    public void setNode(Student student, MyNode nextNode) {
        this.setStudent(student);
        this.setNext(nextNode);
    }

    @Override
    public String toString() {
        return this.student.toString() + "\n";
    }
}
