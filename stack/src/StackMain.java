import stack.MyStack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Stack");
        int stackSize = scan.nextInt();
        MyStack<Integer> stack = new MyStack<>(Integer.class, stackSize);

        while (true) {
            System.out.println("Do you wants to push y/n");
            if (scan.next().trim().charAt(0) != 'y')
                break;
            System.out.println("Enter Element ");
            if (stack.push(scan.nextInt()) == -1) {
                System.out.println("!!!Stack Overflow!!!");
                break;
            }
        }

        for (Integer integer : stack.getStack()) {
            System.out.print(integer + " ");
        }
        System.out.println();

        while (true) {
            System.out.println("Do you wants to pop y/n");
            if (scan.next().trim().charAt(0) != 'y')
                break;
            Integer integer = stack.pop();
            if (integer == null) {
                System.out.println("!!!Stack Is Empty!!!");
                break;
            }
            System.out.println("Popped element--> " + integer);
        }
    }
}
