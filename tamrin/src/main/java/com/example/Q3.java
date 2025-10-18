package com.example;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n1 :");
        double num1 = scanner.nextDouble();
        
        System.out.print("operator:");
        char operator = scanner.next().charAt(0);
        
        System.out.print("n2:");
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result:" +result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("result:" +result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("result:" +result);
                break;
                
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result:" +result);
                } else {
                    System.out.println("error divided by 0!");
                }
                break;
                
            default:
                System.out.println("error invalid operator");
                break;
        }
        
        scanner.close();
    }
}