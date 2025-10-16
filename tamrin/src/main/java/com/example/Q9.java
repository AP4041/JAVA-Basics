package com.example;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int r = (int)(Math.random() * (max - min + 1)) + min;
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        int count = 0;

        do {
            System.out.println("Enter your guess (between 1 and 100): ");
            guess = sc.nextInt();
            count++;
            if (guess < r) {
                System.out.println("Too low! Try again.");
            } else if (guess > r) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + r + " in " + count + " attempts.");
            }
        } while (guess != r);
        sc.close();
    }

    
}
