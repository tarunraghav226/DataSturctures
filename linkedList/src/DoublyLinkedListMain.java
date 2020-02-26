import myLinkedList.DoublyLinkedList;
import node.DoublyLinkedNode;
import student.Student;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        DoublyLinkedNode node;
        int i = 0;
        while (true) {
            Student student = new Student();
            student.setStudent();
            node = new DoublyLinkedNode();
            node.setStudent(student);
            linkedList.insert(node);
            if (i == 5)
                break;
            i++;
        }
        System.out.println("From ahead");
        linkedList.printFromAhead();
        System.out.println("from last");
        linkedList.printFromLast();
    }
}
