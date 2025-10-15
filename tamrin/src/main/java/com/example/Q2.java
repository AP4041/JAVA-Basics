package com.example;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);


        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        for (int i = 0 ; i<n ; i++){
                if (i == 0 || i == n - 1) {
                    for (int j = 0 ; j < n ; j++)
                        System.out.print(c);
                }
                else {
                    for (int j = 0 ; j < n ; j++)
                        if (j == 0 || j == n - 1)
                            System.out.print(c);
                        else
                            System.out.print(" ");
                }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0 ; i< n ; i++){
            for (int j = 0 ; j < n ; j++){
                if (i == j || i + j == n - 1)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }




        sc.close();

    }

}