package com.example;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[][] table = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i][j] = i * j;
            }
        }

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 1; i <= n; i++) {
            mainDiagonalSum += table[i][i];
            secondaryDiagonalSum += table[i][n + 1 - i];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("mainDiagonalSum=" + mainDiagonalSum);
        System.out.println("secondaryDiagonalSum=" + secondaryDiagonalSum);

    }
}
