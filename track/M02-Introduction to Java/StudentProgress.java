
import java.util.Scanner;

public class StudentProgress {

    String name;
    int completedLesson;
    int totalLesson;
    int percentage;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentProgress s = new StudentProgress();
        System.out.print("Enter student name: ");
        s.name = scanner.next();
        System.out.print("Enter completed lessons count: ");
        s.completedLesson = scanner.nextInt();
        System.out.print("Enter total lessons count: ");
        s.totalLesson = scanner.nextInt();
        s.percentage = (s.completedLesson * 100) / s.totalLesson;
        System.out.println("Student: " + s.name);
        System.out.println("Progress: " + s.completedLesson + "/" + s.totalLesson);
        System.out.println("Percentage: " + s.percentage + "%");

        scanner.close();

    }
}
