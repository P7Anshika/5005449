public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John Doe", "S123", "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Update and display student details
        controller.updateView();

        // Change student details
        controller.setStudentName("Jane Doe");
        controller.setStudentId("S456");
        controller.setStudentGrade("B");

        // Update and display student details again
        controller.updateView();
    }
}
