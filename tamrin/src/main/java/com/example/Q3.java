package com.example;
import java.util.Scanner;

public class Q3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("1 Add , 2 Subtract , 3 Multiply , 4 Divide , 5 Modulo , 0 Exit");
        System.out.print("Enter your choice: ");
        
        int n = sc.nextInt();
        while (n != 0){
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Result is: " + (a+b));
                    break;
                case 2:
                    System.out.println("Result is: " + (a-b));
                    break;
                case 3:
                    System.out.println("Result is: " + (a*b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Result is: " + ((double)a/b));
                    else
                        System.out.println("Division by zero is not allowed!");
                    break;
                case 5:
                    if (b != 0)
                        System.out.println("Result is: " + (a%b));
                    else
                        System.out.println("Modulo by zero is not allowed!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
            System.out.println("1 Add , 2 Subtract , 3 Multiply , 4 Divide , 5 Modulo , 0 Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
        }

    }
    
}
