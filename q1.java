 
    import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int n = input.nextInt();
        int[] numbers = new int[n];

          
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

         
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

      
        double avg = (double) sum / n;

        
        System.out.printf("sum=%d%n", sum);
        System.out.printf("avg=%.2f%n", avg);
        System.out.printf("min=%d%n", min);
        System.out.printf("max=%d%n", max);

        input.close();
    }
}

