package myLinkedList;

import interfaces.LinkedListInterface;
import node.MyNode;

public class MyLinkedList implements LinkedListInterface {
    private MyNode node;
    private MyNode head = null;
    private MyNode tail = null;
    private MyNode iterator;

    public MyNode getNode() {
        return null;
    }

    public void setNode(MyNode node) {
        this.node = node;
    }

    private MyNode getHead() {
        if (iterator == null) {
            iterator = head;
            return head;
        } else {
            MyNode temp = iterator;
            iterator.setNext(iterator.getNext());
            return temp;
        }
    }

    private void setHead(MyNode head) {
        this.head = head;
    }

    private MyNode getTail() {
        return tail;
    }

    private void setTail(MyNode tail) {
        this.tail = tail;
    }

    @Override
    public void insertion(MyNode obj) {
        if (this.getHead().getNext() == null) {
            this.setHead(obj);
            this.setTail(obj);
        } else {
            MyNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(obj);
            this.setTail(obj);
        }
    }

    @Override
    public void deletion(MyNode obj) {

    }

    @Override
    public MyNode getObject(int uniqueNumber) {
        return null;
    }

    @Override
    public void update(int uniqueNumber) {

    }

    @Override
    public void sort() {

    }
}
