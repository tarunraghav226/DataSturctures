package myLinkedList;

import interfaces.PrimitiveInterface;
import node.PrimitiveNode;

public class MyLinkedList implements PrimitiveInterface {
    private PrimitiveNode head = null;
    private PrimitiveNode iterator = null;

    public MyLinkedList() {
        iterator = new PrimitiveNode();
    }

    private PrimitiveNode getHead() {
        return this.head;
    }

    private void setHead(PrimitiveNode headNode) {
        this.head = headNode;
    }

    public PrimitiveNode getNode() {
        if (iterator.getNext() == null) {
            iterator.setNode(getHead().getData(), getHead().getNext());
            return iterator;
        } else {
            iterator = iterator.getNext();
            return iterator;
        }
    }

    @Override
    public void insertion(PrimitiveNode obj) {
        if (this.getHead() == null) {
            this.setHead(obj);
        } else {
            PrimitiveNode temp = this.getHead();
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(obj);
        }
    }

    @Override
    public void deletion(PrimitiveNode obj) {

    }

    @Override
    public PrimitiveNode getObject(int uniqueNumber) {
        return null;
    }

    @Override
    public void update(int uniqueNumber) {

    }

    @Override
    public void sort() {

    }
}
