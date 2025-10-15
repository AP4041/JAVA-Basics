import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Kilometer → Mile");
            System.out.println("4. Mile → Kilometer");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter value: ");
            double value = input.nextDouble();
            double result = 0.0;

            switch (choice) {
                case 1:
                    result = value * 1.8 + 32;
                    break;
                case 2:
                    result = (value - 32) / 1.8;
                    break;
                case 3:
                    result = value * 0.621371;
                    break;
                case 4:
                    result = value / 0.621371;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.printf("Result: %.2f%n", result);
            System.out.println();
        }

        input.close();
    }
}
