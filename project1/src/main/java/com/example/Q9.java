package com.example;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;

        while (true) {
            System.out.print("Guess? ");
            guess = input.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Higher");
            } else if (guess > secret) {
                System.out.println("Lower");
            } else {
                System.out.println(" Correct! The number was " + secret);
                System.out.println("Attempts: " + attempts);
                break; 
            }
        }

        input.close();
    }
}
