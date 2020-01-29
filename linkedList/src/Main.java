import myLinkedList.MyLinkedList;
import node.PrimitiveNode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of nodes --> ");
        int numberOfNodes = scan.nextInt();

        //Linked List declaration
        MyLinkedList linkedList = new MyLinkedList(numberOfNodes);

        //Node declaration
        PrimitiveNode node = new PrimitiveNode();

        for (int i = 0; i < numberOfNodes; i++) {
            node = new PrimitiveNode();
            node.setNode(i, null);
            linkedList.insertion(node);
        }

        System.out.println("Displaying list ---> ");
        for (int i = 0; i < numberOfNodes; i++) {
            System.out.println(linkedList.getNode());
        }

        System.out.println("Enter data to be searched --> ");
        int dataToBeSearched = scan.nextInt();
        System.out.println(linkedList.getObject(dataToBeSearched));
    }
}
