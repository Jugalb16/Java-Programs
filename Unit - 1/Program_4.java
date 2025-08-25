// Program to perform arithmetic operations.

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            
            double result;
            
            switch (operation) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Error: Invalid operation.");
            }
        }
    }
}
