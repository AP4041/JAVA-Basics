import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = Integer.parseInt(s);
        String t = sc.nextLine().trim();
        int a = Integer.parseInt(t);
        String e = sc.nextLine().trim();
        int b = Integer.parseInt(e);

        if (isPrime(n)) {
            System.out.println("");
        }
        System.out.print("Prime(" + n + ")= ");
        System.out.println((isPrime(n)) ? "true" : "false");
        System.out.print("Primes<=" + n + ":");
        primes(n);
        System.out.println("gcd(" + a + "," + b + ") =" + gcd(a, b));
        System.out.println("lcm(" + a + "," + b + ") =" + lcm(a, b));
        sc.close();

    }

    static boolean isPrime(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void primes(int x) {
        for (int i = 2; i <= x; i++) {
            if (isPrime(i)) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    static int lcm(int x , int y){
        return (x*y)/gcd(x, y);
    }
}
