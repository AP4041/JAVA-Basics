package com.example;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i=0 ;i < n;  i++ )
            numbers[i] = scanner.nextInt();

        for(int i=0 ; i < n-1 ; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (numbers[j] < numbers[minIndex]){
                    minIndex = j;

                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1)
                System.out.print(" ");
    }
    System.out.println();
    int t = scanner.nextInt();
    int index = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == t) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        scanner.close();
    }
}