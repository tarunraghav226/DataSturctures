import node.PriorityNode;
import priorityQueue.LinkedPriorityQueue;
import student.Student;

import java.util.Scanner;

public class LinkedPriorityQueueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedPriorityQueue linkedPriorityQueue = new LinkedPriorityQueue();
        PriorityNode priorityNode = new PriorityNode();
        boolean flag = true;
        while (flag) {
            System.out.println("Press\n1 for insertion\n2 for deletion\n3 for peek\n4 for exit");
            char choice = scan.next().charAt(0);
            scan.nextLine();
            switch (choice) {
                case '1':
                    Student student = new Student();
                    System.out.print("Enter name of student -- ");
                    student.setName(scan.nextLine().trim());
                    System.out.print("Enter cpi of student -- ");
                    student.setCpi(scan.nextFloat());
                    scan.nextLine();
                    System.out.print("Enter priority -- ");
                    priorityNode.setStudent(student);
                    priorityNode.setPriority(scan.nextInt());
                    scan.nextLine();
                    linkedPriorityQueue.enQueue(priorityNode);
                    priorityNode = new PriorityNode();
                    break;
                case '2':
                    priorityNode = linkedPriorityQueue.deQueue();
                    System.out.println("Deleted node -- " + priorityNode);
                    break;
                case '3':
                    System.out.println(linkedPriorityQueue.peek());
                    break;
                case '4':
                    flag = false;
                    System.out.println("!!BYE!!");
                    break;
            }

        }
    }
}
