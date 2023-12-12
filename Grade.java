// Grade.java

public class Grade {
    private Student student;
    private Course course;
    private char grade;

    public Grade(Student student, Course course, char grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Grade Information:");
        student.displayInfo();
        course.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
