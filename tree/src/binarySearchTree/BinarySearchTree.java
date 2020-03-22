package binarySearchTree;

import node.TreeNode;
import student.Student;

public class BinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode node) {
        root = node;
    }

    public Student search(float cpi) {
        Student student = new Student();
        if (root.getStudent().getCpi() == cpi)
            student = root.getStudent();
        else {
            TreeNode temp = root;
            while (true) {
                if (temp == null)
                    break;

                if (Float.compare(cpi, temp.getStudent().getCpi()) == 0)
                    student = temp.getStudent();
                if (Float.compare(cpi, temp.getStudent().getCpi()) > 0)
                    temp = temp.getRightNode();
                else
                    temp = temp.getLeftNode();
            }
        }
        return student;
    }

    public void insert(Student student) {
        TreeNode node = new TreeNode();
        node.setStudent(student);

        if (getRoot() == null)
            setRoot(node);
        else {
            TreeNode current = getRoot();
            TreeNode parent = getRoot();
            boolean isLeft = false;

            while (current != null) {
                if (Float.compare(student.getCpi(), current.getStudent().getCpi()) > 0) {
                    isLeft = false;
                    parent = current;
                    current = current.getRightNode();
                } else {
                    isLeft = true;
                    parent = current;
                    current = current.getLeftNode();
                }
            }

            if (isLeft) {
                parent.setLeftNode(node);
            } else {
                parent.setRightNode(node);
            }
        }
    }

    public void show(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.getStudent());
        show(node.getLeftNode());
        show(node.getRightNode());
    }
}
