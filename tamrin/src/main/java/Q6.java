import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        selectionSort(arr);

        System.out.print("Enter target: ");
        int key = input.nextInt();
        int index = linearSearch(arr, key);

        System.out.println(index);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
