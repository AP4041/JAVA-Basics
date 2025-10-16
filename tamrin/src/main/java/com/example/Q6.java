package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integer elements : ");
        int n = sc.nextInt();

        System.out.print("Enter a target integer to search :");
        int t = sc.nextInt();


        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();    
        }

        System.out.println("Array before sorting : ");
        System.out.println(Arrays.toString(arr));

        // sorting the array
        for (int i = 0 ; i < n - 1 ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array after sorting : ");
        System.out.println(Arrays.toString(arr));

        // searching for the index of the first target element

        boolean h = false;
        for (int i = 0 ; i < n ; i++) {
            if (arr[i] == t) {
                System.out.print("The index of the first target element is : ");
                System.out.println(i+1);
                h = true;
                break;
            }
        }

        if (!h) {
            System.out.println("Target element not found in the array.");
        }



        sc.close();

    }
    
}
