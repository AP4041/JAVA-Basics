import java.util.Scanner;

public class NumberFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } System.out.println("prime(" + n + ")=" + isPrime);

        System.out.print("primes<=" + n + ": ");
        boolean first = true;
        for (int i = 2; i <= n; i++) {
            boolean primeCheck = true;
            if (i <= 1) {
                primeCheck = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        primeCheck = false;
                        break;
                    }
                }
            }
            if (primeCheck) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();

        int num1 = a;
        int num2 = b;

        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        int gcd = num1;
        int lcm = (a * b) / gcd;

        System.out.println("gcd(" + a + "," + b + ")=" + gcd);
        System.out.println("lcm(" + a + "," + b + ")=" + lcm);

        sc.close();
    }
}