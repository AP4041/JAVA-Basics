package com.example;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Kilometer → Mile");
            System.out.println("4. Mile → Kilometer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter value: ");
            double value = sc.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = value * 1.8 + 32;
                    System.out.printf("Result: %.2f°F%n", result);
                    break;

                case 2:
                    result = (value - 32) / 1.8;
                    System.out.printf("Result: %.2f°C%n", result);
                    break;

                case 3:
                    result = value * 0.621371;
                    System.out.printf("Result: %.2f miles%n", result);
                    break;

                case 4:
                    result = value / 0.621371;
                    System.out.printf("Result: %.2f km%n", result);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}

