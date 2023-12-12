// Course.java

public class Course {
    private int courseId;
    private String title;

    public Course(int courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Title: " + title);
    }
}
