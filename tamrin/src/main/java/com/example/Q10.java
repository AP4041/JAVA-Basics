package com.example;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (2–15): ");
        int n = sc.nextInt();

        int[][] table = new int[n][n];
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");

                if (i == j) {
                    mainDiagonalSum += table[i][j];
                }
                if (i + j == n - 1) {
                    secondaryDiagonalSum += table[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("mainDiagonalSum=" + mainDiagonalSum);
        System.out.println("secondaryDiagonalSum=" + secondaryDiagonalSum);

        sc.close();
    }
}
