package com;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            if(choice == 0 ){
                break;
            }

            System.out.println();
            int num1 = sc.nextInt();
            System.out.println();
            int num2 = sc.nextInt();

            switch (choice) {
                case 1: 
                System.out.println(num1 + num2);
                    break;
                case 2: 
                System.out.println(num1 - num2);
                    break;
                case 3:
                System.out.println(num1 * num2);
                    break;
                case 4:
                if (num2 == 0){
                    System.out.println("Error: divide by zero");
                } else {
                    System.out.println(num1 / num2);
                    }
                    break;
                case 5:
                if( num2 ==0){
                    System.out.println("Error: divide by zero");
                } else {
                    System.out.println(num1 % num2);
                }
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
