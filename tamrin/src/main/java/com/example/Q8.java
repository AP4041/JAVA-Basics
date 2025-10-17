package com.example;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        
        boolean isLeap = isLeapYear(y);
        System.out.println("leap=" + isLeap);
        
        int daysInMonth = getDaysInMonth(m, isLeap);
        System.out.println("daysInMonth=" + daysInMonth);
        
        int dayOfYear = getDayOfYear(y, m, d);
        System.out.println("dayOfYear=" + dayOfYear);
        
        scanner.close();
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
    
    public static int getDaysInMonth(int month, boolean isLeap) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
                
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
                
            case 2:  // February
                return isLeap ? 29 : 28;
                
            default:
                return 0; // invalid month
                        }
    }
    
    public static int getDayOfYear(int year, int month, int day) {
        boolean isLeap = isLeapYear(year);
        int dayOfYear = 0;
        
        for (int i = 1; i < month; i++) {
            dayOfYear += getDaysInMonth(i, isLeap);
        }
        
        dayOfYear += day;
        
        return dayOfYear;
    }
}

