import circularQueue.CircularQueue;
import student.Student;

import java.util.Scanner;

public class CircularMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of circular queue ");
        CircularQueue circularQueue = new CircularQueue(scan.nextInt());
        scan.nextLine();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter\n1 for insertion\n2 for deletion\n3 for peek\n4 for exit");
            switch (scan.next().charAt(0)) {
                case '1':
                    Student student = new Student();
                    System.out.print("Enter name ");
                    student.setName(scan.next());
                    System.out.print("Enter cpi ");
                    student.setCpi(scan.nextFloat());
                    circularQueue.enEqueue(student);
                    break;
                case '2':
                    circularQueue.deQueue();
                    break;
                case '3':
                    circularQueue.peekInQueue();
                    break;
                case '4':
                    System.out.println("Bye !!!");
                    flag = false;
                    break;
            }
        }
    }
}
