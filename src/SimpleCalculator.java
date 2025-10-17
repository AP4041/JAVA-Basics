import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculator Menu:)");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("0. Exit");
            System.out.print("Choose operation: ");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Bye!");

                System.out.println("Press Enter to exit...");
                scanner.nextLine();
                scanner.nextLine();
                break;
            }

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            int result;

            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Error: divide by zero");
                    } else {
                        result = a / b;
                        System.out.println("Result: " + result);
                    }
                    break;

                case 5:
                    if (b == 0) {
                        System.out.println("Error: divide by zero");
                    } else {
                        result = a % b;
                        System.out.println("Result: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println("Press Enter to continue....");
            scanner.nextLine();
            scanner.nextLine();
        }
        scanner.close();
    }
}