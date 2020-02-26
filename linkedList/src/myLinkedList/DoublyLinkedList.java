package myLinkedList;

import node.DoublyLinkedNode;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public DoublyLinkedNode getHead() {
        return head;
    }

    public void setHead(DoublyLinkedNode head) {
        this.head = head;
    }

    public void insert(DoublyLinkedNode node) {
        if (getHead() == null) {
            setHead(node);
            node.setPrevious(getHead());
        } else {
            DoublyLinkedNode temp = getHead();
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(node);
            node.setPrevious(temp);
        }
    }

    public void printFromAhead() {
        DoublyLinkedNode temp = getHead();
        while (temp != null)
            System.out.println(temp);
    }

    public void printFromLast() {
        DoublyLinkedNode temp = new DoublyLinkedNode();
        while (temp.getNext() != null)
            temp = temp.getNext();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getPrevious();
        }
    }
}
