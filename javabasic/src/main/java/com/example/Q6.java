package com.example;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arrey = new int[n];

        for (int i = 0; i < n; i++) {
            arrey[i] = scanner.nextInt();
        }
        int t = scanner.nextInt();

        selectionSort(arrey, n);
        int index = linearSearch(arrey, n, t);

        for (int i = 0; i < n; i++) {
            System.out.print(arrey[i] + " ");
        }
        System.out.println();

        System.out.println(index);
    }

    public static void selectionSort(int[] a, int n) {

        for (int i = 0; i < n -1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

    } 

    public static int linearSearch(int[] a, int n, int t) {

        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                return i;
            }          
        }
        return -1;

    }
}
