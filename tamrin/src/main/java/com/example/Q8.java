package com.example;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int year, month, day;
        boolean isValid;
        
        do {
            isValid = false;
            
            System.out.print("Enter Year :");
            year = sc.nextInt();
            System.out.print("Enter Month :");
            month = sc.nextInt();
            System.out.print("Enter Day :");
            day = sc.nextInt();


            if (year % 4 == 0 && month == 2 && day > 29) {
            System.out.println("Invalid Date");
            isValid = true;
            } else if (year % 4 != 0 && month == 2 && day > 28) {
            System.out.println("Invalid Date");
            isValid = true;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("Invalid Date");
            isValid = true;
            } else {
            System.out.println("Valid Date");
            }

        } while (isValid == true);


        if ( year % 4 == 0 ) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


        switch (month) {
            case (1 | 3 | 5 | 7 | 8 | 10 | 12):
                System.out.println("This month has 31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;

            case 2:
                if (year % 4 == 0) {
                    System.out.println("This month has 29 days");
                } else {
                    System.out.println("This month has 28 days");
                }
                break;
                
            default:
                break;
        }


        if ( year % 4 == 0)
            System.out.println("the number of days in the year " + year + " is 366");
        else
            System.out.println("the number of days in the year " + year + " is 365");

        
        sc.close();
    }
    
}
