import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Unit Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Kilometer to Mile");
            System.out.println("4. Mile to Kilometer");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");

                break;
            }
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = 0;
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
        }
        scanner.close();
    }
}
