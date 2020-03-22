import binarySearchTree.BinarySearchTree;
import student.Student;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setName("Tarun " + i);
            student.setCpi(5.1f + i);
            bst.insert(student);
        }


        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setName("Tarun " + i);
            student.setCpi(5.1f - i);
            bst.insert(student);
        }

        bst.show(bst.getRoot());

        System.out.println(bst.search(4.1f));
    }
}
