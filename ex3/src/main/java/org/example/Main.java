import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("===MENU===");
            System.out.println("1.Add");
            System.out.println("2.subtract");
            System.out.println("3.multiply");
            System.out.println("4.divide");
            System.out.println("5.modulo");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("bye!");
                break;
            }
            if (choice >= 1 && choice <= 5) {
                System.out.println("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("result:" + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("result:" + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("result:" + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("result:" + (num1 / num2));
                        break;
                    case 5:
                        if (num2 == 0) {
                            System.out.println("error:division by zero");
                        } else {
                            System.out.println("result:" + (num1 % num2));
                            break;
                        }
                        System.out.println("Invalid choice! Please try again.");
                }
            }

        }
        sc.close();
    }
}


