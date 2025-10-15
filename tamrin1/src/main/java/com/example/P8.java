import java.util.*;

public class P8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y, m, d;
        System.out.print("enter year:");
        y = input.nextInt();
        System.out.print("enter month:");
        m = input.nextInt();
        System.out.print("enter day:");
        d = input.nextInt();
        boolean s = k(y);
        if (s) {
            System.out.println("leap = true");
        } else {
            System.out.println("leap = false");

        }
        System.out.format("day in month = %d\n", m(m, y));
        System.out.format("day in year = %d\n", y(d, m, y));

    }

    public static boolean k(int y) {
        if (y % 4 == 0) {
            return true;
        }
        return false;

    }

    public static int m(int m, int y) {
        if (m <= 6) {
            return 31;
        } else if (m <= 11) {
            return 30;
        } else if (m == 12) {
            if (k(y)) {
                return 30;
            } else {
                return 29;
            }
        }
        return 0;
    }

    public static int y(int d, int m, int y) {
        return m(m, y) * (m - 1) + d;

    }

}