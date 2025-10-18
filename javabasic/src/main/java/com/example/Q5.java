package com.example;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.println("0. Exit");
        System.out.println("1. Celsius --> Fahrenheit");
        System.out.println("2. Fahrenheit --> Celsius");
        System.out.println("3. Kilometer --> Mile");
        System.out.println("4. Mile --> Kilometer");

        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Bye!");
            break;
        }

        double in = scanner.nextInt(); 
        double value;
        switch (n) {
            case 1:
                value = in * 1.8 + 32;
                break;
            case 2:
                value = (in - 32) / 1.8;
                break;
            case 3:
                value = in * 0.621371;
                break;
            case 4:
                value = in / 0.621371;
                break;
            default:
                System.out.println("Invalid option!");
                continue;
        }

        System.out.printf("Result: %.2f%n", value);

        }
        
    }
}
