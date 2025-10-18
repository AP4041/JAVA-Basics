package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("===CONVERT MENU===");
            System.out.println("1.Celsius to Fahrenheit");
            System.out.println("2.Fahrenheit to Celsius");
            System.out.println("3.Kilometer to miles");
            System.out.println("4.Miles to kilometers");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("bye!");
                break;
            }
            int num = sc.nextInt();
            switch (choice) {
            case 1:
            System.out.printf("result : %.2f%n",+(num*1.8+32));
            break;
            case 2:
                System.out.printf("result : %.2f%n", +((num-32)/1.8));
                break;
                case 3:
                    System.out.printf("result : %.2f%n", +(num*0.621371));
                    break;
                    case 4:
                        System.out.printf("result : %.2f%n", +(num/0.621371));
                        break;


            }
        }
        sc.close();
    }
}