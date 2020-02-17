import linkedQueue.LinkedQueue;
import node.Node;
import student.Student;

import java.util.Scanner;

public class LinkedQueueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedQueue linkedQueue = new LinkedQueue();
        boolean flag = true;
        while (flag) {
            System.out.println("Press\n1 for insertion\n2 for deletion\n3 for peek\n4 for exit");
            char choice = scan.next().charAt(0);
            switch (choice) {
                case '1':
                    Student student = new Student();
                    Node node = new Node();
                    System.out.println("Enter student details");
                    System.out.println("Enter name");
                    student.setName(scan.next().trim());
                    System.out.println("Enter cpi");
                    student.setCpi(scan.nextFloat());
                    scan.nextLine();
                    node.setStudent(student);
                    linkedQueue.enQueue(node);
                    break;
                case '2':
                    node = linkedQueue.deQueue();
                    if (node == null)
                        System.out.println("Underflow");
                    else
                        System.out.println(node);
                    break;
                case '3':
                    node = linkedQueue.peekInQueue();
                    if (node == null)
                        System.out.println("No elements");
                    else
                        System.out.println(node);
                    break;
                case '4':
                    System.out.println("!!!BYE!!!");
                    flag = false;
                    break;
            }
        }
    }
}
