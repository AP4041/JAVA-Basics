package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        int guess;

        do{
            System.out.println("Guess?");
            guess = sc.nextInt();
            attempts++;

            if(guess<randomNumber) {
                System.out.println("Higher ");
            }  else if(guess>randomNumber) {
                System.out.println("Lower ");
            }
                }while (guess!=randomNumber);

            System.out.println("correct! the number was" +randomNumber);
            System.out.println("attempts: "+attempts);

            sc.nextLine();


    }
}