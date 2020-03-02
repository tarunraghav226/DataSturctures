import binaryTree.BinaryTree;
import student.Student;


public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Student student = new Student();

        student.setName("Ta");
        binaryTree.insert(student);

        student = new Student();
        student.setName("Ka");
        binaryTree.insert(student);

        student = new Student();
        student.setName("Qa");
        binaryTree.insert(student);

        student = new Student();
        student.setName("Aa");
        binaryTree.insert(student);

        student = new Student();
        student.setName("Va");
        binaryTree.insert(student);

        student = new Student();
        student.setName("La");
        binaryTree.insert(student);

        student = new Student();
        student.setName("Ja");
        binaryTree.insert(student);

        System.out.println("------Pre Order---------");
        binaryTree.DLR(binaryTree.getRoot());
        System.out.println("------Pre Order---------");

        System.out.println("------In Order---------");
        binaryTree.LDR(binaryTree.getRoot());
        System.out.println("------In Order---------");

        System.out.println("------Post Order---------");
        binaryTree.LRD(binaryTree.getRoot());
        System.out.println("------Post Order---------");
    }
}
