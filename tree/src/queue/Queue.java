package queue;

import node.Node;
import node.TreeNode;

public class Queue {

    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enQueue(TreeNode treeNode) {
        Node node = new Node();
        node.setTreeNode(treeNode);
        if (front == null && rear == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = rear.getNext();
        }
    }

    public TreeNode deQueue() {
        TreeNode treeNode = new TreeNode();
        if (front == null && rear == null)
            System.out.println("Underflow");
        else if (front == rear) {
            treeNode = front.getTreeNode();
            front = null;
            rear = null;
        } else {
            treeNode = front.getTreeNode();
            front = front.getNext();
        }
        return treeNode;
    }
}
