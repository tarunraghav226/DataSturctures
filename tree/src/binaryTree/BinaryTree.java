package binaryTree;

import node.TreeNode;
import queue.Queue;
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
        TreeNode node = new TreeNode();
        Queue queue = new Queue();
        node.setStudent(student);
        if (getRoot() == null) {
            setRoot(node);
        } else {
            queue.enQueue(root);
            while (true) {
                TreeNode temp = queue.deQueue();
                if (temp.getLeftNode() != null) {
                    queue.enQueue(temp.getLeftNode());
                } else {
                    temp.setLeftNode(node);
                    break;
                }
                if (temp.getRightNode() != null) {
                    queue.enQueue(temp.getRightNode());
                } else {
                    temp.setRightNode(node);
                    break;
                }
            }
        }
    }
}
