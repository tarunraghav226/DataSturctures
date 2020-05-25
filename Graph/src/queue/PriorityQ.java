package queue;

import edge.Edge;

public class PriorityQ {
    private final int MAX_SIZE = 20;
    private Edge[] arr;
    private int size;

    public PriorityQ() {
        arr = new Edge[MAX_SIZE];
        size = 0;
    }

    public void insert(Edge item) {
        int j;
        for (j = 0; j < size; j++)
            if (item.distance >= arr[j].distance)
                break;
        for (int k = size - 1; k >= j; k--)
            arr[k + 1] = arr[k];
        arr[j] = item;
        size++;
    }

    public Edge removeMin() {
        return arr[--size];
    }

    public void removeN(int n) {
        for (int i = n; i < size - 1; i++)
            arr[i] = arr[i + 1];
        size--;
    }

    public Edge peekMin() {
        return arr[size - 1];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Edge peekN(int n) {
        return arr[n];
    }

    public int find(int dest) {
        for (int i = 0; i < size; i++)
            if (arr[i].destVert == dest)
                return i;
        return -1;
    }
}