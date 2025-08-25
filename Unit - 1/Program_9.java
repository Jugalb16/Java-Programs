// Program to find student grade using if condition
import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;
        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B+";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 35) {
            grade = "Pass";
        } else if (marks >= 0) {
            grade = "Fail";
        } else {
            grade = "Invalid marks entered";
        }

        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
