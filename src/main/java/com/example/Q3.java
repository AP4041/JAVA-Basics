package com.example;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operation;
        
        do {
            System.out.println("\nmashin hesab");
           
            System.out.println("0 khoroj ");
            System.out.print("alamat ra vared konid");
            
            operation = scanner.next().charAt(0);
            
            if (operation == '0') {
                System.out.println("exit");
                break;
            }
            
            System.out.print("adad aval ");
            int num1 = scanner.nextInt();
            
            System.out.print("adad 2");
            int num2 = scanner.nextInt();
            
            switch (operation) {
                case '+':
                    System.out.println("javab " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                    
                case '-':
                    System.out.println(" javab" + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                    
                case '*':
                    System.out.println("javab" + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                    
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: divide by zero");
                    } else {
                        System.out.println("javab" + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
                    
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error: divide by zero");
                    } else {
                        System.out.println("javab" + num1 + " % " + num2 + " = " + (num1 % num2));
                    }
                    break;
                    
                default:
                    System.out.println("erorr");
            }
            
        } while (operation != '0');
        
        scanner.close();
    }
}