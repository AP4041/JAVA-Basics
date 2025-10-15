import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n (2-15): ");
        int n = input.nextInt();

        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        int k = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            k += table[i][i];
            z += table[i][n - 1 - i];
        }

        System.out.println("k=" + k);
        System.out.println("z=" + z);

        input.close();
    }
}
