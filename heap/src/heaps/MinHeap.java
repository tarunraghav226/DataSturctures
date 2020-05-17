package heaps;

import node.Node;

public class MinHeap {
    private Node[] heap;
    private int currentSize;
    private int maxSize;

    public MinHeap(int maxSize) {
        heap = new Node[maxSize];
        this.maxSize = maxSize;
        this.currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return maxSize == currentSize;
    }

    public boolean insert(int key) {
        if (isFull()) {
            System.out.println("!!!Heap is full!!!");
            return false;
        }

        heap[currentSize] = new Node(key);
        trickleUp(currentSize++);
        return true;
    }

    public void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = heap[currentSize - 1];
        while (index > 0 && bottom.getKey() < heap[parent].getKey()) {
            heap[index] = heap[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heap[index] = bottom;
    }

    public Node remove() {
        if (isEmpty()) {
            System.out.println("!!!Heap is empty!!!");
            return null;
        }
        Node deletedNode = heap[0];
        heap[0] = heap[--currentSize];
        trickleDown(0);
        return deletedNode;
    }

    public void trickleDown(int index) {
        int smaller;
        Node top = heap[index];
        while (index < currentSize / 2) {
            int rightChild = 2 * index + 2;
            int leftChild = rightChild - 1;
            if (rightChild < currentSize && heap[rightChild].getKey() <= heap[leftChild].getKey())
                smaller = rightChild;
            else
                smaller = leftChild;
            if (top.getKey() <= heap[smaller].getKey())
                break;
            heap[index] = heap[smaller];
            index = smaller;
        }
        heap[index] = top;
    }
}
