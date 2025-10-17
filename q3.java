import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply"); 
            System.out.println("4. Divide");
            System.out.println("5. Module");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            
            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }
            
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: divide by zero");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: divide by zero");
                    } else {
                        System.out.println("Result: " + (num1 % num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
        input.close();
    }
}
