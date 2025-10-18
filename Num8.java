import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        boolean leapyear = false;
        if (y % 4 == 0) leapyear = true;
        Num8 obj = new Num8();
        System.out.println("Leapyear : " + leapyear);
        System.out.println("Days in month : " + obj.daysInMonth(m ,leapyear));
        System.out.println("Days in year : " + obj.daysInYear(m ,d ,leapyear));
    }
    public int daysInMonth(int month , boolean leapyear) {
        if(month == 12 && leapyear) {
            return 30;
        }
        else if(month >= 1 && month <= 6) {
            return 31;
        }
        else if(month >= 7 && month <= 11) {
            return 30;
        }
        else return 29;
    }
    public int daysInYear(int month , int day , boolean leapyear) {
        int daysinyear = 0;
        for(int i= 1; i < month; i++) {
            daysinyear += daysInMonth(i, leapyear);
        }
        daysinyear += day;
        return daysinyear;
    }
}
