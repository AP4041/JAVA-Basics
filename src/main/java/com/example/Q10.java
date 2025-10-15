package com.example;

import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[][] table = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += table[i][i];
            secondaryDiagonalSum += table[i][n - 1 - i];
        }
        
        System.out.println("ghotr asli=" + mainDiagonalSum);
        System.out.println("ghotr faree=" + secondaryDiagonalSum);
        
        scanner.close();
    }
}

