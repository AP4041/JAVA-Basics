package com.example;

import java.util.Scanner;

public class  Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 -> Celsius → Fahrenheit (F = C×1.8 + 32)  ");
        System.out.println("2️ Fahrenheit → Celsius (C = (F−32)/1.8)   ");
System.out.println("3 Kilometer → Mile (mile = km×0.621371)  ");
System.out.println("4  Mile → Kilometer (km = mile/0.621371) ");
System.out.println("5  exit");

        while (true) {
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }
            
            double value = scanner.nextDouble();
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = value * 1.8 + 32;
                    break;
                case 2:
                    result = (value - 32) / 1.8;
                    break;
                case 3:
                    result = value * 0.621371;
                    break;
                case 4:
                    result = value / 0.621371;
                    break;
            }
            
            System.out.printf("Result: %.2f\n", result);
        }
        
        scanner.close();
    }
}