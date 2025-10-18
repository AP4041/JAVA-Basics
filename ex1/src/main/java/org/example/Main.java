import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
            if(i==0){
                max=arr[0];
                min=arr[0];
            }
            if(arr[i]>max){
              max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("sum=" + sum);
        System.out.println("avg=" + (double)sum/n);
        System.out.println("min=" + min);
        System.out.println("max=" + max);


    }
}
