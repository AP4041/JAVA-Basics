import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n for primes: ");
        int n = input.nextInt();
        System.out.println("prime(" + n + ")=" + isPrime(n));

        System.out.print("primes<=" + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Enter two numbers for GCD/LCM: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        System.out.println("gcd(" + a + "," + b + ")=" + gcdValue);
        System.out.println("lcm(" + a + "," + b + ")=" + lcmValue);

        input.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) return false;
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
        return (a / gcd(a, b)) * b;
    }
}