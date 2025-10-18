package com;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int randNum= (int)(Math.random()* 100) + 1;
        int guessNum=0;
        int guess;

        do{
            System.out.print("Guess?");
            guess=sc.nextInt();
            guessNum++;

            if(randNum > guess){
                System.out.println("Higher");
            } else if (randNum < guess){
                System.out.println("Lower");
            } else {
                System.out.println("correct! the number was " + randNum);
                System.out.println("attempts:" + guessNum);
            }
        } while( guessNum != guess);
        sc.close();
    }
    
}
