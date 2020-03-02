import binaryTree.BinaryTree;
import node.TreeNode;
import student.Student;


public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode();

        Student student = new Student();
        student.setName("Tarun");
        student.setCpi(1.9f);
        TreeNode treeNode = new TreeNode();
        root.setStudent(student);

        treeNode = new TreeNode();
        student = new Student();
        student.setName("Arun");
        student.setCpi(2.9f);
        treeNode.setStudent(student);
        root.setLeftNode(treeNode);

        treeNode = new TreeNode();
        student = new Student();
        student.setName("Parun");
        student.setCpi(5.9f);
        treeNode.setStudent(student);
        root.setRightNode(treeNode);

        treeNode = new TreeNode();
        student = new Student();
        student.setName("Varun");
        student.setCpi(3.9f);
        treeNode.setStudent(student);
        root.getLeftNode().setLeftNode(treeNode);

        treeNode = new TreeNode();
        student = new Student();
        student.setName("kArun");
        student.setCpi(3.9f);
        treeNode.setStudent(student);
        root.getLeftNode().setRightNode(treeNode);

        treeNode = new TreeNode();
        student = new Student();
        student.setName("Qarun");
        student.setCpi(4.9f);
        treeNode.setStudent(student);
        root.getRightNode().setLeftNode(treeNode);

        System.out.println("------Pre Order---------");
        binaryTree.DLR(root);
        System.out.println("------Pre Order---------");

        System.out.println("------In Order---------");
        binaryTree.LDR(root);
        System.out.println("------In Order---------");

        System.out.println("------Post Order---------");
        binaryTree.LRD(root);
        System.out.println("------Post Order---------");
    }
}
