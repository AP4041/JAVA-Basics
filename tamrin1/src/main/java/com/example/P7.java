import java.util.*;

public class P7n {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your number:");
        int n = input.nextInt();
        boolean x = p(n);
        if (x) {
            System.out.println("your number is prime");
        } else {
            System.out.println("your number is not prime");

        }
        pp(n);
        System.out.println("enter 2 numbers =");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("GCD = " + gcd(a, b));
        System.out.println();
        System.out.print("LCD = " + lcd(a, b));
        System.out.println();

    }

    public static boolean p(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void pp(int n) {
        for (int i = 1; i < n; i++) {
            if (p(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}