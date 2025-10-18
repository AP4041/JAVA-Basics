import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        int n = Integer.parseInt(a);
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            String b = sc.nextLine().trim();
            num[i] = Integer.parseInt(b);
        }
        String c = sc.nextLine().trim();
        int index = Integer.parseInt(c);
        sort(num, index);
        sc.close();
    }

    static void sort(int[] x, int d) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = 0;
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        for (int k = 0; k < x.length; k++) {
            System.out.print(x[k]);
            System.out.print((k != x.length - 1) ? " " : "");
        }

        boolean find = false;
        for (int z = 0; z < x.length; z++) {
            if (x[z] == d) {
                find = true;
                System.out.print("\n" + z);
                break;
            }
        }

        if (!find) {
            System.out.println("\n-1");
        }

    }
}
