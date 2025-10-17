import java.util.Scanner;

public class SimpleStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        double avg = (double) sum / n;
        System.out.println("sum=" + sum);
        System.out.printf("avg=%.2f\n", avg);
        System.out.println("min=" + min);
        System.out.println("max=" + max);
        scanner.close();
    }
}