package node;


public class Node {
    private TreeNode treeNode;
    private Node next;

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode node) {
        this.treeNode = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "treeNode=" + treeNode +
                '}';
    }
}
