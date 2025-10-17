import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] table = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(table[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        int mainSum = 0;
        for (int i = 0; i < n; i++) {
            mainSum += table[i][i]; // i == j
        }


        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            secondarySum += table[i][n - 1 - i]; // i + j == n - 1
        }
        System.out.println("mainDiagonalSum=" + mainSum);
        System.out.println("secondaryDiagonalSum=" + secondarySum);
        sc.close();
    }
}