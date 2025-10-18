import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        int n = Integer.parseInt(a);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim();
            nums[i] = Integer.parseInt(str);
        }
        SumAvg(nums);
        MinMax(nums);
        sc.close();
    }

    static void SumAvg(int[] x) {
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s += x[i];
        }
        System.out.println("sum=" + s);
        System.out.printf("avg= %.2f%n", (double) s / x.length);

    }

    static void MinMax(int[] y) {
        int min = 0;
        int max = 0;
        if (y.length > 1) {
            for (int i = 0; i < y.length; i++) {
                if (y[i] > max) {
                    max = y[i];
                } else if (y[i] < min) {
                    min = y[i];
                }
            }

        } else if (y.length == 1) {
            min = y[0];
            max = y[0];
        }

        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }

}