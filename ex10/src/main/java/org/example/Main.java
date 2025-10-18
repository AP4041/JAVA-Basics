package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (2-15)");
        int n = sc.nextInt();

        int[][] table = new int[n][n];
        System.out.println("/n" + n + "x" + n + "Multiplication table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i+1)*(j+1);
                System.out.printf("%-4d ", table[i][j]);
            }
            System.out.println();
        }
        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mainSum += table[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            secondarySum += table[i][j];
        }

        System.out.println("mainDiagonalSum=" + mainSum);
        System.out.println("secondaryDiagonalSum=" + secondarySum);

        sc.close();

    }
}