package com.example;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double avg = (double) sum / n;

        System.out.printf("sum=%d%n", sum);
        System.out.printf("avg=%.2f%n", avg);
        System.out.printf("min=%d%n", min);
        System.out.printf("max=%d%n", max);

        scanner.close();
    }
}
