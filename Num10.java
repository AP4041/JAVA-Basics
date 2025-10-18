import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MDS = 0; // main diagonal sum
        int SDS = 0; // second diagonal sum
        int n = sc.nextInt();
        System.out.println();
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = String.valueOf((i+1) * (j+1));
            }
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    MDS += Integer.parseInt(arr[i][j]);
                }
                if(i+j == n-1){
                    SDS += Integer.parseInt(arr[i][j]);
                }
                if(arr[i][j].length() == 1) arr[i][j] = arr[i][j] + "  ";
                else if(arr[i][j].length() == 2) arr[i][j] = arr[i][j] + " ";
            }
        }
        for(int i = 1; i <= 4*n; i++) {
            for(int j = 1; j <= 2*n; j++) {
                if(i % 4 == 0) System.out.print(" ");
                else if(j % 2 == 0) System.out.print(" ");
                else if((i - 1) % 4 == 0) System.out.print(arr[(i-1)/4][(j-1)/2]);
            }
            System.out.println();
        }
        System.out.println("MDS: " + MDS);
        System.out.println("SDS: " + SDS);
    }
}
