import node.PriorityNode;
import priorityQueue.ArrayPriorityQueue;
import student.Student;

import java.util.Scanner;

public class ArrayPriorityQueueMain {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        ArrayPriorityQueue arrayPriorityQueue = new ArrayPriorityQueue(5);
        PriorityNode priorityNode = new PriorityNode();
        Student student = new Student();
        for (int i = 0; i < 5; i++) {

        }
        for (int i = 0; i < 7; i++) {
        }
        while (flag) {
            System.out.println("Press\n1 for insertion\n2 for deletion\n3 for peek\n4 for print full all data\n5 for exit");
            char choice = scan.nextLine().charAt(0);
            switch (choice) {
                case '1':
                    System.out.print("Enter name -- ");
                    student.setName(scan.nextLine().trim());
                    System.out.print("Enter cpi -- ");
                    student.setCpi(scan.nextFloat());
                    scan.nextLine();
                    priorityNode.setStudent(student);
                    System.out.print("Enter priority -- ");
                    priorityNode.setPriority(scan.nextInt());
                    scan.nextLine();
                    arrayPriorityQueue.enQueue(priorityNode);
                    priorityNode = new PriorityNode();
                    student = new Student();
                    break;
                case '2':
                    arrayPriorityQueue.deQueue();
                    break;
                case '3':
                    System.out.println("Peek data -- " + arrayPriorityQueue.peek());
                    break;
                case '4':
                    arrayPriorityQueue.print();
                    break;
                case '5':
                    System.out.println("!!!BYE!!!");
                    flag = false;
                    break;
            }
        }
    }
}
