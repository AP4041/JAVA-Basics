import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter two numbers: ");
            int a = input.nextInt();
            int b = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b == 0)
                        System.out.println("Error: divide by zero");
                    else
                        System.out.println("Result: " + (a / b));
                    break;
                case 5:
                    if (b == 0)
                        System.out.println("Error: divide by zero");
                    else
                        System.out.println("Result: " + (a % b));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }

        input.close();
    }
}