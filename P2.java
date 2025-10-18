import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        int n = Integer.parseInt(a);
        String b = sc.nextLine().trim();
        char ch = b.charAt(0);
        tra(n, ch);
        System.out.println();
        squ(n, ch);
        System.out.println();
        Xsh(n, ch);
        sc.close();
    }

    static void tra(int x, char c) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void squ(int x, char c) {
        for (int i = 1; i <= x; i++) {
            if (i == 1 || i == x) {
                for (int j = 1; j <= x; j++) {
                    System.out.print(c);
                }
            } else {

                System.out.print(c);
                for (int k = 1; k <= x - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print(c);

            }
            System.out.println();
        }
    }

    static void Xsh(int x, char c) {
        char[][] mat = new char[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j || j + i == x - 1) {
                    mat[i][j] = c;
                }
                else{
                    mat[i][j]=' ';
                }
            }
        }

        for (int k = 0; k < x; k++) {
            for (int z = 0; z < x; z++) {
                System.out.print(mat[k][z]);
            }
            System.out.println();
        }
    }
}
