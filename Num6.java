import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; int t; int min; int temp; int minLoc = 0;
        n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            boolean MinChanged = false;
            min = numbers[i];
            for (int j = i+1; j < n; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minLoc = j;
                    MinChanged = true;
                }
            }
            if(MinChanged){
                temp = numbers[i];
                numbers[i] = numbers[minLoc];
                numbers[minLoc] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(numbers[i] == t){
                System.out.print(i);
                break;
            }
        }
    }
}
