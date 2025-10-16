package com.example;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter demesion of square matrix : ");
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        System.out.println("Enter elements of matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Element [%d][%d] : ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Sum of main diagonal elements : ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);

        System.out.println(" Sum of secondary diagonal elements : ");
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i][n - 1 - i];
        }
        System.out.println(sum2);
        sc.close();

    }
    
}
