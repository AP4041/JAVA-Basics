import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();

        boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);

        int daysInMonth = 0;
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: daysInMonth = 31; break;
            case 4: case 6: case 9: case 11: daysInMonth = 30; break;
            case 2: daysInMonth = leap ? 29 : 28; break;
        }

        int dayOfYear = d;
        for (int i = 1; i < m; i++) {
            switch (i) {
                case 1: case 3: case 5: case 7: case 8: case 10: dayOfYear += 31; break;
                case 4: case 6: case 9: case 11: dayOfYear += 30; break;
                case 2: dayOfYear += leap ? 29 : 28; break;
            }
        }

        System.out.println("leap=" + leap);
        System.out.println("daysInMonth=" + daysInMonth);
        System.out.println("dayOfYear=" + dayOfYear);
        in.close();
    }
}
