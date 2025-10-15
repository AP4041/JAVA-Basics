import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        boolean leap = isLeapYear(year);
        System.out.println("leap=" + leap);

        int daysInMonth = getDaysInMonth(year, month);
        System.out.println("daysInMonth=" + daysInMonth);

        int dayOfYear = getDayOfYear(year, month, day);
        System.out.println("dayOfYear=" + dayOfYear);

        input.close();
    }

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getDaysInMonth(int y, int m) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(y) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static int getDayOfYear(int y, int m, int d) {
        int[] daysInMonths = {31, isLeapYear(y)?29:28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += daysInMonths[i];
        }
        sum += d;
        return sum;
    }
}
