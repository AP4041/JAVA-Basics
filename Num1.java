import java.text.DecimalFormat;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0; int min; int max;
        int n; int a;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0]; min = arr[0];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        avg = (double) sum / n;
        System.out.println(sum + " " + df.format(avg) + " " + max + " " + min);
    }
}
