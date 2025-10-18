package com.example;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arrey = new int[n];
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            arrey[i] = scanner.nextInt();
            sum += arrey[i];
        }
        double avg = ((double) sum) / n;

        int max = arrey[0];
        int min = arrey[0];
        for (int j = 1; j < n; j++) {
            if (arrey[j] < min) {
                min = arrey[j];                
            }      
    
            if (max < arrey[j]) {
                max = arrey[j];                
            }            
        }

        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }
}
