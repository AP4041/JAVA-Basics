package com.example;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        
        // Pattern 1: Right Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 2: Hollow Square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // Pattern 3: X Shape
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
