package com.example;
import java.util.Scanner;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        
        boolean isLeap = isLeapYear(y);
        int daysInMonth = getDaysInMonth(m, isLeap);
        int dayOfYear = calculateDayOfYear(y, m, d);
        
        System.out.println("kabise=" + isLeap);
        System.out.println("roz dar mah=" + daysInMonth);
        System.out.println("roz dar sal=" + dayOfYear);
        
        scanner.close();
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getDaysInMonth(int month, boolean isLeap) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeap ? 29 : 28;
            default:
                return 0;
        }
    }
    
    public static int calculateDayOfYear(int year, int month, int day) {
        int dayOfYear = day;
        
        for (int m = 1; m < month; m++) {
            dayOfYear += getDaysInMonth(m, isLeapYear(year));
        }
        
        return dayOfYear;
    }
}
