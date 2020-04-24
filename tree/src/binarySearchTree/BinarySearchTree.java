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

    public Student minimumCPI() {
        TreeNode temp = getRoot();

        if (temp == null)
            return null;

        while (temp.getLeftNode() != null)
            temp = temp.getLeftNode();
        return temp.getStudent();
    }

    public Student maximumCPI() {
        TreeNode temp = getRoot();
        if (temp == null)
            return null;

        while (temp.getRightNode() != null)
            temp = temp.getRightNode();

        return temp.getStudent();
    }

    public boolean delete(float cpi) {
        TreeNode parent = getRoot();
        TreeNode current = getRoot();
        boolean isLeft = true;

        if (getRoot() == null) {
            System.out.println("No tree");
            return false;
        }

        while (Float.compare(current.getStudent().getCpi(), cpi) != 0) {
            parent = current;
            if (Float.compare(current.getStudent().getCpi(), cpi) > 0) {
                isLeft = true;
                current = current.getLeftNode();
            } else {
                isLeft = false;
                current = current.getRightNode();
            }
            if (current == null)
                return false;
        }

        if (current.getLeftNode() == null && current.getRightNode() == null) {
            if (current == getRoot()) {
                setRoot(null);
            } else if (isLeft) {
                parent.setLeftNode(null);
            } else {
                parent.setRightNode(null);
            }
        } else if (current.getRightNode() == null) {
            if (current == getRoot()) {
                setRoot(current.getLeftNode());
            } else if (isLeft) {
                parent.setLeftNode(current.getLeftNode());
            } else {
                parent.setRightNode(current.getLeftNode());
            }
        } else if (current.getLeftNode() == null) {
            if (current == getRoot()) {
                setRoot(current.getRightNode());
            } else if (isLeft) {
                parent.setLeftNode(current.getRightNode());
            } else {
                parent.setRightNode(current.getRightNode());
            }
        } else {
            TreeNode successor = getSuccessor(current);
            if (current == getRoot()) {
                setRoot(successor);
            } else if (isLeft) {
                parent.setLeftNode(successor);
            } else {
                parent.setRightNode(successor);
            }
            successor.setLeftNode(current.getLeftNode());
        }
        return true;
    }

    private TreeNode getSuccessor(TreeNode delNode) {
        TreeNode successorParent = delNode;
        TreeNode successor = delNode;
        TreeNode current = delNode.getRightNode();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftNode();
        }

        if (successor != delNode.getRightNode()) {
            successorParent.setLeftNode(successor.getRightNode());
            successor.setRightNode(delNode.getRightNode());
        }

        return successor;
    }
}
