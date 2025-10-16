package com.example;
import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0 ; i<n ; i++){
            System.out.print("Enter element " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i<n ; i++){
            System.out.print("Element " + i + ": ");
            System.out.println(array[i]);
        }

        //Sum of elements
        System.out.print("Calculating sum of elements... \n");
        int sum = 0;
        for (int i = 0 ; i<n ; i++){
            sum += array[i];
            if (i == n-1)
                System.out.print("Sum is: " + sum);
        }

        //Average of elements
        System.out.print("\nCalculating average of elements... \n");
        double avg = (double) sum / n;
        System.out.printf("Average is %.2f: " , avg);

        //Minimum element
        System.out.print("\nFinding minimum element... \n");
        int min = array[0];
        for (int i = 1 ; i<n ; i++){
            if (array[i] < min)
                min = array[i];
        }
        System.out.print("Minimum element is: " + min);

        //Maximum element
        System.out.print("\nFinding maximum element... \n");
        int max = array[0];
        for (int i = 1 ; i<n ; i++){
            if (array[i] > max)
                max = array[i];
        }
        System.out.print("Maximum element is: " + max);
        sc.close();
    }
}
