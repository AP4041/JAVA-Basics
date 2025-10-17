import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // نمایش منو
            System.out.println("Menu:");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Kilometer → Mile");
            System.out.println("4. Mile → Kilometer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int option = sc.nextInt();

            if (option == 0) {
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter value: ");
            double value = sc.nextDouble();
            double result = 0;

            switch (option) {
                case 1: // Celsius → Fahrenheit
                    result = value * 1.8 + 32;
                    break;
                case 2: // Fahrenheit → Celsius
                    result = (value - 32) / 1.8;
                    break;
                case 3: // Kilometer → Mile
                    result = value * 0.621371;
                    break;
                case 4: // Mile → Kilometer
                    result = value / 0.621371;
                    break;
                default:
                    System.out.println("Invalid option!");
                    continue;
            }

            System.out.printf("Result: %.2f%n", result);
            System.out.println(); // خط خالی برای زیبایی
        }
        
        sc.close();
    }
}