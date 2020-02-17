package student;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private int libraryCode;
    private String section;
    private String course;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getRollNo() {
        return rollNo;
    }

    private void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    private int getLibraryCode() {
        return libraryCode;
    }

    private void setLibraryCode(int libraryCode) {
        this.libraryCode = libraryCode;
    }

    private String getSection() {
        return section;
    }

    private void setSection(String section) {
        this.section = section;
    }

    private String getCourse() {
        return course;
    }

    private void setCourse(String course) {
        this.course = course;
    }

    public void setStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of student --> ");
        this.setName(scan.next().trim());
        System.out.print("Enter the roll number of student --> ");
        this.setRollNo(scan.nextInt());
        System.out.print("Enter the library code of student --> ");
        this.setLibraryCode(scan.nextInt());
        System.out.print("Enter section of student --> ");
        this.setSection(scan.next().trim());
        System.out.print("Enter course of student --> ");
        this.setCourse(scan.next().trim());
    }

    @Override
    public String toString() {
        return "Student name --> " + this.getName() + "\n" +
                "Student roll number --> " + this.getRollNo() + "\n" +
                "Student library code --> " + this.getLibraryCode() + "\n" +
                "Student section --> " + this.getSection() + "\n" +
                "Student course --> " + this.getCourse() + "\n";
    }
}