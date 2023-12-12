// SchoolManagementSystem.java

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Alice", "alice@example.com");
        Student student2 = new Student(2, "Bob", "bob@example.com");

        // Create courses
        Course course1 = new Course(101, "Java Programming");
        Course course2 = new Course(102, "Database Management");

        // Create grades
        Grade grade1 = new Grade(student1, course1, 'A');
        Grade grade2 = new Grade(student2, course1, 'B');
        Grade grade3 = new Grade(student1, course2, 'C');

        // Display information
        System.out.println("Grade Information:");
        grade1.displayInfo();
        System.out.println();
        grade2.displayInfo();
        System.out.println();
        grade3.displayInfo();
    }
}
