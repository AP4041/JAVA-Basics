package com.example;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year:");
        int y = scanner.nextInt();
        System.out.println("Enter month:");
        int m = scanner.nextInt();
        System.out.println("Enter day:");
        int d = scanner.nextInt();

        boolean isLeap = (y % 400 == 0 || y % 4 ==  0 & y % 100 != 0);
        System.out.println("leap=" + isLeap);
        int daysInMonth = 0;
        switch (m) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                daysInMonth = 31;
                break;
            case 4:case 6:case 9:case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = (isLeap? 29 : 28);
                break;
            default:
                System.out.println("Invalid month!");
                return;
        }
        System.out.println("daysInMonth=" + daysInMonth);
        int dayofyear = d;
        for (int i = 1; i < m; i++) {
            switch (i) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayofyear += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dayofyear += 30;
                    break;
                case 2:
                    dayofyear += (isLeap ? 29 : 28);
                    break;
            }
        }

        System.out.println("dayofyear=" + dayofyear);
        scanner.close();
    }
    
}
