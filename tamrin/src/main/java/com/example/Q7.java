package com.example;
import java.util.Scanner;

public class Q7 {
    public static void main (String[] args) {
        
        System.out.print("Enter a number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        isPrime(n);
       
        System.out.println("\nEnter two numbers to find GCD and LCM:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));

        sc.close();
    }

    




    static void isPrime(int n){

        // check if n is prime
         int count = 0;
        if ( n < 2) {
            System.out.println( n + " is NOT prime");
            return;
            
        }
        else {
            for ( int i = 2; i <= Math.sqrt(n); i++) {
                if ( n % i == 0) {
                    System.out.println( n + " is NOT prime");
                    count++;
                    break;
                }
            }
        }
        if ( count == 0) {
            System.out.println( n + " is prime");
        }


        // find all primes less than n
        System.out.println("All primes less than " + n + " are:");
        for ( int i = 2; i < n; i++) {
            int prime = 1;
            for ( int j = 2; j <= Math.sqrt(i); j++) {
                if ( i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if ( prime == 1) {
                System.out.print(i + " ");
            }
        }

    }
    
    
    
    
    
    
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}
