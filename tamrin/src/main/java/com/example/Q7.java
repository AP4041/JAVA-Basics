package com.example;
import java.util.Scanner;

public class Q7 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("prime(" + n + ")=" + isPrime(n));

        System.out.print("primes<=" + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int g = gcd(a, b);
        int l = lcm(a, b);

        System.out.println("gcd(" + a + "," + b + ")=" + g);
        System.out.println("lcm(" + a + "," + b + ")=" + l);

        sc.close();
    }
}
