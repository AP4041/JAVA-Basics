import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        int choice; int a; int b; int answer = 0;
        Scanner sc = new Scanner(System.in);
        outer : while (true){
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            System.out.print("Enter A: ");
            a = sc.nextInt();
            System.out.print("Enter B: ");
            b = sc.nextInt();
            switch(choice){
                case 1:
                    answer = a + b; break outer;
                case 2:
                    answer = a - b; break outer;
                case 3:
                    answer = a * b; break outer;
                case 4:
                    if(b == 0) {
                        System.out.println("Error : Division by zero");
                        break;
                    }
                    answer = a / b; break outer;
                case 5:
                    answer = a % b; break outer;
                default:
                    System.out.println("Error : Invalid choice");
            }
        }
        System.out.println(answer);
    }
}
