package com.example;
import java.util.Scanner;

public class Q7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        boolean isPrime = isPrime(n);
        System.out.println("prime(" + n + ")=" + isPrime);
        
        System.out.print("primes<=" + n + ": ");
        printPrimesUpTo(n);
        
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("gcd(" + a + "," + b + ")=" + gcd);
        System.out.println("lcm(" + a + "," + b + ")=" + lcm);
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void printPrimesUpTo(int n) {
        if (n >= 2) {
            System.out.print(2);
        }
        
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
    
    public static int gcd(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
    
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }
}
    
