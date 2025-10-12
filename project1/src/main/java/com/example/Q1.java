package com.example;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

      
        int sum = 0;
        int min = arr[0];
        int max = arr[0];

       
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        
        double avg = (double) sum / n;

        
        System.out.println("sum=" + sum);
        System.out.printf("avg=%.2f\n", avg); 
        System.out.println("min=" + min);
        System.out.println("max=" + max);

        input.close();
    }
}
