package com.example;
import java.util.Scanner;


public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Celsius → Fahrenheit (F = Cx1.8 + 32)");
            System.out.println("2. Fahrenheit → Celsius (C = (F-32)/1.8)");
            System.out.println("3. Kilometer → Mile (mile = kmx0.621371)");
            System.out.println("4. Mile → Kilometer (km = mile/0.621371)");
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            double value;
            double result;
            
            switch (choice) {
                case 1:
                    // Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius: ");
                    value = scanner.nextDouble();
                    result = value * 1.8 + 32;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                    
                case 2:
                    // Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit: ");
                    value = scanner.nextDouble();
                    result = (value - 32) / 1.8;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                    
                case 3:
                    // Kilometer to Mile
                    System.out.print("Enter distance in Kilometer: ");
                    value = scanner.nextDouble();
                    result = value * 0.621371;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                    
                case 4:
                    // Mile to Kilometer
                    System.out.print("Enter distance in Mile: ");
                    value = scanner.nextDouble();
                    result = value / 0.621371;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                    
                case 0:
                    System.out.println("Bye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
            System.out.println(); 
        } while (choice != 0); 
        
        scanner.close();
    }
}
