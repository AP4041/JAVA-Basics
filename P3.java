import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("\n>>>>>>> MENU <<<<<<<");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");

            String a = sc.nextLine().trim();
            ch = Integer.parseInt(a);

            if (ch == 0) {
                break;
            }

            switch (ch) {
                case 1:
                    Add(sc);
                    break;

                case 2:
                    sub(sc);
                    break;
                case 3:
                    mul(sc);
                    break;
                case 4:
                    div(sc);
                    break;
                case 5:
                    mod(sc);
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }

    public static void Add(Scanner sc) {
        System.out.print("Number1: ");
        String s = sc.nextLine().trim();
        int x = Integer.parseInt(s);
        System.out.print("Number2: ");

        String h = sc.nextLine().trim();
        int y = Integer.parseInt(h);
        System.out.println("\nResult: " + (x + y));
    }

    public static void sub(Scanner sc) {
        System.out.print("Number1: ");
        String s = sc.nextLine().trim();
        int x = Integer.parseInt(s);
        System.out.print("Number2: ");

        String h = sc.nextLine().trim();
        int y = Integer.parseInt(h);
        System.out.println("\nResult: " + (x - y));

    }

    public static void mul(Scanner sc) {
        System.out.print("Number1: ");

        String s = sc.nextLine().trim();
        int x = Integer.parseInt(s);
        System.out.print("Number2: ");

        String h = sc.nextLine().trim();
        int y = Integer.parseInt(h);
        System.out.println("\nResult: " + (x * y));

    }

    public static void div(Scanner sc) {
        System.out.print("Number1: ");

        String s = sc.nextLine().trim();
        int x = Integer.parseInt(s);
        System.out.print("Number2: ");

        String h = sc.nextLine().trim();
        int y = Integer.parseInt(h);
        if (y == 0) {
            System.out.println("Error: divide by zero");
        } else {
            System.out.println("\nResult: " + (x / y));

        }

    }

    public static void mod(Scanner sc) {
        System.out.print("Number1: ");

        String s = sc.nextLine().trim();
        int x = Integer.parseInt(s);
        System.out.print("Number2: ");

        String h = sc.nextLine().trim();
        int y = Integer.parseInt(h);
        if (y == 0)
            System.out.println("Error: divide by zero");
        else {
            System.out.println("\nResult: " + (x % y));

        }

    }
}
