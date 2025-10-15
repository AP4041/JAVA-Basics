import java.util.*;

public class P1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = input.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter element:");
            a[i] = input.nextInt();
        }
        System.out.format("sum = %d\n\navg = %f\n\nminimum = %d\n\nmaximum = %d\n\n", sum(a, n), avg(a, n),
                minimum(a, n), maximum(a, n));

    }

    public static int sum(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

        }
        return sum;

    }

    public static double avg(int a[], int n) {
        return (double) sum(a, n) / n;

    }

    public static int minimum(int a[], int n) {

        int min = a[0];

        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }
        return min;

    }

    public static int maximum(int a[], int n) {

        int max = a[0];

        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }
        return max;

    }
}