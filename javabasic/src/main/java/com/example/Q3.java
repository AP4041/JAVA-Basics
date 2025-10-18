package com.example;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 1;
        int j = 1000;
        String[] ans = new String[j];
        int i;

        for (i = 0; n > 0; i++) {

            ans[i] = new String();

            System.out.println("0. Exit");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");

            n = scanner.nextInt();
            int f = (n != 0) ? scanner.nextInt() : 1;
            int l = (n != 0) ? scanner.nextInt() : 1;

            switch (n) {
                case 0:
                    ans[i] = "Bye!";
                    break;
                case 1:
                    ans[i] = "Result:" + (f + l);
                    break;
                case 2:
                    ans[i] = "Result:" + (f - l);
                    break;
                case 3:
                    ans[i] = "Result:" + (f * l);
                    break;
                case 4:
                    ans[i] = (l == 0) ? "Error: divide by zero" : "Result:" + (f / l) ;
                    break;
                case 5:
                    ans[i] = (l == 0) ? "Error: divide by zero" : "Result:" + (f % l) ;
                    break;
                default:
                    ans[i] = "out of range";
                    break;
            }
        }
        
        for (int k = 0; k < i; k++) {
            System.out.println(ans[k]);
        }

    }
}
