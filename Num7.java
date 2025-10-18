import java.util.Arrays;
import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a; int b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        Num7 obj = new Num7();
        System.out.println(n + " is Prime? : " + obj.printPrimes(n));
        int gcd = obj.gcd(a,b);
        int lcm = a * b / gcd;
        System.out.println("gcd(" + a + "," + b + ") : " + gcd);
        System.out.println("lcm(" + a + "," + b + ") : " + lcm);
    }
    public boolean printPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers (n<=" + n + ") = ");
        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return isPrime[n];
    }
    public int gcd(int a , int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
