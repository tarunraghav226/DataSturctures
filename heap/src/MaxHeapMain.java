import heaps.MaxHeap;
import node.Node;

import java.util.Scanner;

public class MaxHeapMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of heap");
        MaxHeap heap = new MaxHeap(scan.nextInt());
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
