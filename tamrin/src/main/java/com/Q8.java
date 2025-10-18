package com;
import java.util.Scanner;

public class Q8 {
    public static boolean isLeapYear(int year){
        return(year + 1)% 4 == 0;
    }
    public static int getDaysInMonth(int month, int year){
        switch (month){
            case 1: case 2: case 3: case 4: case 5: case 6:
            return 31;
            case 7: case 8: case 9: case 10: case 11:
            return 30;
            case 12:
            return isLeapYear(year) ? 30 : 29;
            default:
            return 0;
        }
    }
    public static int getDaysOfYear(int day, int month, int year){
        int dayOfYear = 0;

        for(int m=1; m<month; m++){
            dayOfYear += getDaysInMonth(m, year);
        }
        dayOfYear += day;
        return dayOfYear;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int y= sc.nextInt();
        int m= sc.nextInt();
        int d= sc.nextInt();

        boolean leap = isLeapYear(y);
        int daysInMonth= getDaysInMonth(m, y);
        int dayOfYear= getDaysOfYear(d, m, y);

        System.out.println("leap=" + leap);
        System.out.println("daysInMonth=" + daysInMonth);
        System.out.println("daysOfYear=" + dayOfYear);

        sc.close();
    }
    
}
