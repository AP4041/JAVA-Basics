package com.example;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int rand = (int) (Math.random() * 100) + 1;
        int i = 0;
        int guess;

        do {

            System.out.print("Guess? ");
            guess = scanner.nextInt();
            i++;  

            if (guess < rand) {
                System.out.println("Higher");
            } else if (guess > rand) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct! The number was " + rand);
                System.out.println("Attempts: " + i);
            }

        } while (guess != rand);
    }
}
