package com.example;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n < 0) {
            n = scanner.nextInt();
        }
        char c = scanner.next().charAt(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);                
            }
            System.out.println();            
        }

        System.err.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n-1) || j == 0 || j == (n-1)) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }

        System.err.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i+j == n-1) {
                    System.out.print(c);
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}
