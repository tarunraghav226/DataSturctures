import myLinkedList.MyLinkedList;
import node.PrimitiveNode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int oldData, newData, position;
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

        System.out.print("Enter old data to be update --> ");
        oldData = scan.nextInt();
        System.out.print("Enter new data to be saved --> ");
        newData = scan.nextInt();

        linkedList.update(oldData, newData);

        System.out.println("Displaying Updated list ---> ");
        for (int i = 0; i < numberOfNodes; i++) {
            System.out.println(linkedList.getNode());
        }

        System.out.print("Enter position of node to be deleted --> ");
        position = scan.nextInt();
        linkedList.deletion(position);

        System.out.println("Displaying Updated list ---> ");
        for (int i = 0; i < linkedList.getNumberOfNodes(); i++) {
            System.out.println(linkedList.getNode());
        }
    }
}
