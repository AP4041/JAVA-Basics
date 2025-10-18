import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a;
        Num5 obj = new Num5();
        while(true){
            System.out.println("Enter Your Choice: ");
            System.out.println("1.Celsius → Fahrenheit");
            System.out.println("2.Fahrenheit → Celsius");
            System.out.println("3.Kilometer → Mile");
            System.out.println("4.Mile → Kilometer");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            if (choice == 0){
                break;
            }
            System.out.println("Enter Value : ");
            a = sc.nextInt();
            double result = obj.converter(choice, a);
            if (result == -1){
                System.out.println("Error : Invalid input");
                continue;
            }
            System.out.printf("Result: %.2f%n", result);
        }
    }
    public double converter(int choice, double a){
        return switch (choice) {
            case 1 -> (a * 1.8 + 32);
            case 2 -> ((a - 32) / 1.8);
            case 3 -> (a * 0.621371);
            case 4 -> (a / 0.621371);
            default -> -1;
        };
    }
}
