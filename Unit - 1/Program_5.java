// Get different values from user using scanner and print

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get a String input
        System.out.print("Enter a string : ");
        String name = scanner.nextLine();

        // Get an integer input
        System.out.print("Enter an integer : ");
        int age = scanner.nextInt();

        // Get a float input
        System.out.print("Enter a float : ");
        float weight = scanner.nextFloat();

        // Get a double input
        System.out.print("Enter a double : ");
        double height = scanner.nextDouble();

        // Get a boolean input
        System.out.print("Enter a boolean (True/ False): ");
        boolean isStudent = scanner.nextBoolean();

        scanner.nextLine();

        System.out.println("\n--- Your Information ---");
        System.out.println("String: " + name);
        System.out.println("Integer: " + age);
        System.out.println("Float: " + weight + " kg");
        System.out.println("Double: " + height + " m");
        System.out.println("Boolean: " + isStudent);

        // Close the scanner
        scanner.close();
    }
}
