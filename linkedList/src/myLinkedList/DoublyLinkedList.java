package myLinkedList;

import node.DoublyLinkedNode;

public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    public DoublyLinkedNode getTail() {
        return tail;
    }

    public void setTail(DoublyLinkedNode tail) {
        this.tail = tail;
    }

    public DoublyLinkedNode getHead() {
        return head;
    }

    public void setHead(DoublyLinkedNode head) {
        this.head = head;
    }

    public void insert(DoublyLinkedNode node) {
        if (getHead() == null) {
            setHead(node);
            setTail(node);
        } else {
            DoublyLinkedNode temp = getHead();
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(node);
            setTail(node);
            node.setPrevious(temp);
        }
    }

    public void printFromAhead() {
        DoublyLinkedNode temp = getHead();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public void printFromLast() {
        DoublyLinkedNode temp = getTail();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getPrevious();
        }
    }
}
