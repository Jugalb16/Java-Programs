// Program to get name from user and print ten times using loop

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": " + name);
        }

        scanner.close();
    }
}
