package com.example;
    import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1: Check prime");
            System.out.println("2: Print primes ≤ n");
            System.out.println("3:  GCD and LCM");
            System.out.println("0: Exit");
            
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Enter n: ");
                    int n1 = scanner.nextInt();
                    if (isPrime(n1)) {
                        System.out.println(n1 + " is prime");
                    } else {
                        System.out.println(n1 + " is not prime");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter n: ");
                    int n2 = scanner.nextInt();
                    System.out.print("Primes ≤ " + n2 + ": ");
                    for (int i = 2; i <= n2; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.print("vared kon  a va b: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int gcd = gcd(a, b);
                    int lcm = lcm(a, b, gcd);
                    System.out.println("GCD(" + a + "," + b + ") = " + gcd);
                    System.out.println("LCM(" + a + "," + b + ") = " + lcm);
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

