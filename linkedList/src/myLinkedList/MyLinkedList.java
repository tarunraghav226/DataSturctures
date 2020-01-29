package myLinkedList;

import interfaces.PrimitiveInterface;
import node.PrimitiveNode;

public class MyLinkedList implements PrimitiveInterface {
    private PrimitiveNode head = null;
    private PrimitiveNode iterator = null;
    private int numberOfNodes;

    public MyLinkedList(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        iterator = new PrimitiveNode();
    }

    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }

    private PrimitiveNode getHead() {
        return this.head;
    }

    private void setHead(PrimitiveNode headNode) {
        this.head = headNode;
    }

    public PrimitiveNode getNode() {
        if (iterator.getNext() == null) {
            iterator = new PrimitiveNode();
            iterator = getHead();
        } else {
            iterator = iterator.getNext();
        }
        return iterator;
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
    public void deletion(int position) {
        iterator = new PrimitiveNode();
        PrimitiveNode temp = new PrimitiveNode();

        if (getHead() != null && position == 1) {
            setHead(getHead().getNext());
            numberOfNodes--;
        } else if (position == numberOfNodes) {
            for (int i = 0; i < numberOfNodes - 1; i++) {
                temp = getNode();
            }
            temp.setNext(null);
            numberOfNodes--;
        } else {
            for (int i = 0; i < position - 1; i++) {
                temp = getNode();
            }
            temp.setNext(temp.getNext().getNext());
            numberOfNodes--;
        }

        iterator = new PrimitiveNode();
    }

    @Override
    public PrimitiveNode getObject(int uniqueNumber) {
        PrimitiveNode object = new PrimitiveNode();
        for (int i = 0; i < this.numberOfNodes; i++) {
            PrimitiveNode temp = getNode();
            if (temp.getData() == uniqueNumber) {
                object = temp;
                break;
            } else {
                object = null;
            }
        }
        return object;
    }

    @Override
    public void update(int uniqueNumber, int newData) {
        PrimitiveNode object = this.getObject(uniqueNumber);
        object.setData(newData);
    }

    @Override
    public void sort() {

    }
}
