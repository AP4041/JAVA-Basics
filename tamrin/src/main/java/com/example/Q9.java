package com.example;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = (int)(Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        do {
            System.out.print("Guess? ");
            guess = scanner.nextInt(); 
            attempts++;
            if (guess<target){
                System.out.println("Higher");
            } 
            else if(guess>target){
                System.out.println("Lower");
            } 
            else{
                System.out.println(" Correct! The number was " + target);
                System.out.println("Attempts: " + attempts);
            }
        } 
        while(guess!=target);
        scanner.close();
    }
}