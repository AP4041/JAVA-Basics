package com.example;
import java.util.Scanner;

public class Q8 {

    public static boolean isLeap(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }

    public static int daysInMonth(int y, int m) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeap(y) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static int dayOfYear(int y, int m, int d) {
        int dayNum = d;
        for (int i = 1; i < m; i++) {
            dayNum += daysInMonth(y, i);
        }
        return dayNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        boolean leap = isLeap(y);
        int days = daysInMonth(y, m);
        int dayNum = dayOfYear(y, m, d);

        System.out.println("leap=" + leap);
        System.out.println("daysInMonth=" + days);
        System.out.println("dayOfYear=" + dayNum);

        sc.close();
    }
}

