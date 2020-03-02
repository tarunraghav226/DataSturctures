package binaryTree;

import node.TreeNode;
import student.Student;

public class BinaryTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode node) {
        this.root = node;
    }

    public void DLR(TreeNode node) {
        if (node == null)
            return;
        else {
            System.out.println(node);
            DLR(node.getLeftNode());
            DLR(node.getRightNode());
        }
    }

    public void LDR(TreeNode node) {
        if (node == null)
            return;
        else {
            LDR(node.getLeftNode());
            System.out.println(node);
            LDR(node.getRightNode());
        }
    }

    public void LRD(TreeNode node) {
        if (node == null)
            return;
        else {
            LRD(node.getLeftNode());
            LRD(node.getRightNode());
            System.out.println(node);
        }
    }

    public void insert(Student student) {

    }
}
