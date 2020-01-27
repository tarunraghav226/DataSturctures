package student;

public class Student {
    private String name;
    private int rollNo;
    private int libraryCode;
    private String section;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getLibraryCode() {
        return libraryCode;
    }

    public void setLibraryCode(int libraryCode) {
        this.libraryCode = libraryCode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
