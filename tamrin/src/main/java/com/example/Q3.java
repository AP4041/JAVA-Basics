package com.example;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("choose an option:");
            System.out.println("0.exit");
            System.out.println("1.add");
            System.out.println("2.substract");
            System.out.println("3.multiply");
            System.out.println("4.divide");
            System.out.println("5.modulo");

            int choice = scanner.nextInt();

            if(choice==0){
                System.out.println("end");
                 break;
            }

            System.out.println("enter first number:");
            int a = scanner.nextInt();
            System.out.println("enter second number:");
            int b = scanner.nextInt();

            switch(choice){
                case 1:
                System.out.println("result = " + (a+b) );
                break;
                case 2:
                System.out.println("resultn = " + (a-b));
                case 3:
                System.out.println("result = " + (a*b));
                case 4:
                if(b==0)
                    System.out.println("can not divide by 0");
                    else
                        System.out.println("result = " + (double)(a/b));
                    break;
                case 5:
                if(b==0)
                    System.out.println("can not divide by 0");
                else
                System.out.println("result = " + (a%b));
                break;
                default:
                System.out.println("invalid choice!");
            }

        }
        scanner.close();
    }
}
