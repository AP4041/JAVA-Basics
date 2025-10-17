import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        boolean leap = false;
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            leap = true;
        }
        System.out.println("leap=" + leap);

        int daysInMonth = 0;
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = leap ? 29 : 28;
                break;
        }
        System.out.println("daysInMonth=" + daysInMonth);

        int dayOfYear = d;
        for (int month = 1; month < m; month++) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayOfYear += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dayOfYear += 30;
                    break;
                case 2:
                    dayOfYear += leap ? 29 : 28;
                    break;
            }
        }
        System.out.println("dayOfYear=" + dayOfYear);

        scanner.close();
    }
}