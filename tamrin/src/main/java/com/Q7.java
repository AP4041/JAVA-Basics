package com;
import java.util.Scanner;

public class Q7 {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i*i <= n; i+= 2){
            if (n%i == 0) return false;
        }
        return true;
    }
    public static void printPrime(int n){
        for(int i =2; i <= n; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int t = a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return (a*b)/ gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("prime(" + n + ")=" + isPrime(n));
        System.out.print("primes <=" + n + ": ");
        printPrime(n);

        System.out.println("gcd(" + a + "," + b + ")=" + gcd(a, b));
        System.out.println("lcm(" + a + "," + b + ")=" + lcm(a, b));

        sc.close();
    }
}
