package com.example;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n:");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            scanner.close();
            return;
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;  // کوچکترین مقدار ممکن
        int min = Integer.MAX_VALUE;  // بزرگترین مقدار ممکن
                
        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            
            sum += number;
            
            if (number > max) {
                max = number;
            }
            
            if (number < min) {
                min = number;
            }
        }
        
        double average = (double) sum / n;
        
        System.out.println("sum:" + sum);
        System.out.println("average:" + average);
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        
        scanner.close();
    }
}