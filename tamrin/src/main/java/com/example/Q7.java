package com.example;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter n:");
       int n = scanner.nextInt();

       boolean isPrime = isPrime(n);
       System.out.println("Prime("+n+")" + isPrime);
       System.out.println("Primes<=" +n+ ":");
       for(int i=2 ; i<=n ; i++){
        if (isPrime(i))
           System.out.println(i + " ");
       }
       System.out.println();

       System.out.println("Enter a , b:");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int gcd = gcd(a, b);
       int lcm = a*b/gcd(a,b);

       System.out.println("gcd( "+a+"," +b+ ")=" + gcd);
       System.out.println("lcm( "+a+"," +b+ ")=" + lcm);
       scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int gcd(int a , int b){
        while(b!=0){
            int temp= a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}

    