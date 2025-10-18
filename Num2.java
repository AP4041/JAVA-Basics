import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        char c;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.next().charAt(0);

        Num2 n2 = new Num2();
        n2.printTriangle(n, c);
        System.out.println();
        n2.printSquare(n, c);
        System.out.println();
        n2.printX(n, c);
    }
    public void printTriangle(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public void printSquare(int n , char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print(c);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void printX(int n , char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i+j == n+1) {
                    System.out.print(c);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
