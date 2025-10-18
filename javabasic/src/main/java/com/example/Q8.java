package com.example;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        boolean isLeapYear = (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0));

        int daysInMonth = 0;
        switch (m) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2:  // February
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                System.out.println("Invalid month");
                return;
        }

        int dayOfYear = 0;
        for (int i = 1; i < m; i++) {
            switch (i) {
                case 1:  // January
                case 3:  // March
                case 5:  // May
                case 7:  // July
                case 8:  // August
                case 10: // October
                case 12: // December
                    dayOfYear += 31;
                    break;
                case 4:  // April
                case 6:  // June
                case 9:  // September
                case 11: // November
                    dayOfYear += 30;
                    break;
                case 2:  // February
                    dayOfYear += isLeapYear ? 29 : 28;
                    break;
            }
        }
        dayOfYear += d;

        System.out.println("leap=" + isLeapYear);
        System.out.println("daysInMonth=" + daysInMonth);
        System.out.println("dayOfYear=" + dayOfYear);

    }
}
