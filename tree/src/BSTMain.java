import binarySearchTree.BinarySearchTree;
import student.Student;

public class BSTMain {
    Student student = null;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        Student student = new Student();
        student.setName("Tarun " + 20);
        student.setCpi(20f);
        bst.insert(student);

        student = new Student();
        student.setName("Tarun " + 10);
        student.setCpi(10f);
        bst.insert(student);

        student = new Student();
        student.setName("Tarun " + 5);
        student.setCpi(5f);
        bst.insert(student);

        student = new Student();
        student.setName("Tarun " + 15);
        student.setCpi(15f);
        bst.insert(student);

        student = new Student();
        student.setName("Tarun " + 30);
        student.setCpi(30f);
        bst.insert(student);

        student = new Student();
        student.setName("Tarun " + 25);
        student.setCpi(25f);
        bst.insert(student);

        student = new Student();
        student.setName("Tarun " + 35);
        student.setCpi(35f);
        bst.insert(student);

        bst.show(bst.getRoot());

        System.out.println("Searched data --> " + bst.search(11f));

        System.out.println("Minimum CPI Student --> " + bst.minimumCPI());

        System.out.println("Maximium CPI Student --> " + bst.maximumCPI());

        System.out.println("Remove 11 " + bst.delete(11f));
        System.out.println("Remove 20 " + bst.delete(20f));
        System.out.println("Remove 10 " + bst.delete(10f));
        System.out.println("Remove 5 " + bst.delete(5f));
        System.out.println("Remove 15 " + bst.delete(15f));
        System.out.println("Remove 30 " + bst.delete(30f));
        System.out.println("Remove 25 " + bst.delete(25f));
        System.out.println("Remove 35 " + bst.delete(35f));
    }
}
