import heaps.MinHeap;
import node.Node;

import java.util.Scanner;

public class MinHeapMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of heap");
        MinHeap heap = new MinHeap(scan.nextInt());
        while (true) {
            System.out.println("Enter key:");
            int key = scan.nextInt();
            if (!heap.insert(key))
                break;
        }
        System.out.println("---Displaying Heap---");
        while (true) {
            Node node = heap.remove();
            if (node == null)
                break;
            System.out.println(node);
        }
    }
}
