import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        int n = Integer.parseInt(a);

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (1 + i) * (1 + j);
            }
        }

        print(mat, n);

        int maind = 0;
        for (int k = 0; k < n; k++) {
            for (int z = 0; z < n; z++) {
                if (z == k) {
                    maind += mat[k][z];
                }
            }
        }

        System.out.println("mainDiagonalSum: " + maind);

        int secd = 0;
        for (int k = 0; k < n; k++) {
            for (int z = 0; z < n; z++) {
                if (z + k == n - 1) {
                    secd += mat[k][z];
                }
            }
        }

        System.out.println("secondDiagonalSum: " + secd);

        sc.close();
    }

    public static void print(int[][] x, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j]);
                System.out.print((j == n - 1) ? "" : " ");
            }
            System.out.println();
        }
    }
}
