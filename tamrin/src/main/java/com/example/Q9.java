package com.example;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        while (true) {
            System.out.print("Guess? ");
            guess = sc.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Higher");
            } else if (guess > number) {
                System.out.println("Lower");
            } else {
                System.out.println(" Correct! The number was " + number);
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}

