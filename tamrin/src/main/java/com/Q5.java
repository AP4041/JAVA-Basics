package com;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("1. Celsius to Fahrenheit(F = C*1.8 + 32)");
            System.out.println("2. Fahrenheit to celsius(C= (F-32)/1.8)");
            System.out.println("3. Kilometer to Mile(mile = km*0.621371)");
            System.out.println("4. Mile to Kilometer(km = mile/0.621371)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if(choice == 0){
                System.out.println("Bye!");
                break;
            }
            double num = sc.nextDouble();
            double result = 0; 

            switch (choice){
                case 1:
                result = num* 1.8 + 32;
                System.out.printf("Result: %.2f%n", result);
                break;
                case 2:
                result = (num - 32)/ 1.8;
                System.out.printf("Result: %.2f%n", result);
                break;
                case 3:
                result = num * 0.621371;
                System.out.printf("Result: %.2f%n", result);
                break;
                case 4:
                result = num / 0.621371;
                System.out.printf("Result: %.2f%n", result);
                break;
                default:
                System.out.println("Invalid choice");
                break;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
