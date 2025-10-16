package com.example;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 : Celsius to Fahrenheit");
        System.out.println("2 : Fahrenheit to Celsius");
        System.out.println("3 : Kilometer to Mile");
        System.out.println("4 : Mile to Kilometer");
        System.out.println("0 : Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 1.8) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) / 1.8;
                System.out.printf("Temperature in Celsius: %.2f%n", celsius);
                break;

            case 3:
                System.out.print("Enter distance in Kilometer: ");
                double kilometer = sc.nextDouble();
                double mile = kilometer * 0.621371;
                System.out.printf("Distance in Mile: %.2f%n", mile);
                break;

            case 4:
                System.out.print("Enter distance in Mile: ");
                mile = sc.nextDouble();
                kilometer = mile / 0.621371;
                System.out.printf("Distance in Kilometer: %.2f%n", kilometer);
                break;

            case 0:
                System.out.println("Bye...");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("Bye...");

        sc.close();
    }
}
