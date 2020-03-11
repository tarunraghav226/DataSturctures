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
}
