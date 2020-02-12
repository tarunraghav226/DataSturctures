import simpleQueue.SimpleQueue;
import student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        SimpleQueue simpleQueue = new SimpleQueue(size);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter\n1 for insertion\n2 for deletion\n3 for peek\n4 to exit");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    if (simpleQueue.isEmpty()) {
                        System.out.println("You can not enter more element");
                        break;
                    }
                    Student student = new Student();
                    System.out.println("Enter name of student");
                    scan.nextLine();
                    student.setName(scan.nextLine().trim());
                    System.out.println("Enter cpi");
                    student.setCpi(scan.nextFloat());
                    simpleQueue.enQueue(student);
                    size--;
                    break;
                case 2:
                    simpleQueue.deQueue();
                    break;
                case 3:
                    simpleQueue.peekInQueue();
                    break;
                case 4:
                    System.out.println("Bye!!!");
                    flag = false;
                    break;
            }

        }
    }
}
