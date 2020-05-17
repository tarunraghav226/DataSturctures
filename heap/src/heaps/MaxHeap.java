package heaps;

import node.Node;

public class MaxHeap {
    private Node[] heap;
    private int maxSize;
    private int currentSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new Node[this.maxSize];
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean insert(int key) {
        if (isFull()) {
            System.out.println("!!!Heap is full!!!");
            return false;
        }

        Node node = new Node(key);
        heap[currentSize] = node;
        trickleUp(currentSize++);
        return true;
    }

    public void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = heap[currentSize - 1];
        while (index > 0 && heap[parent].getKey() < bottom.getKey()) {
            heap[index] = heap[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heap[index] = bottom;
    }

    public Node remove() {
        if (isEmpty())
            return null;
        Node deletedNode = heap[0];
        heap[0] = heap[--currentSize];
        trickleDown(0);
        return deletedNode;
    }

    public void trickleDown(int index) {
        int largerChild;
        Node top = heap[0];

        while (index < currentSize / 2) {
            int rightChild = 2 * index + 2;
            int leftChild = rightChild - 1;
            if (rightChild < currentSize && heap[leftChild].getKey() < heap[rightChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (top.getKey() >= heap[largerChild].getKey())
                break;
            heap[index] = heap[largerChild];
            index = largerChild;
        }
        heap[index] = top;
    }
}
