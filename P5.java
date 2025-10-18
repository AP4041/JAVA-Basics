import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("\n>>>>>>> MENU <<<<<<<");
            System.out.println("1. Celsius => Fahrenheit (F = Cx1.8 + 32)");
            System.out.println("2. Fahrenheit => Celsius (C = (F-32)/1.8)");
            System.out.println("3. Kilometer => Mile (mile = kmx0.621371)");
            System.out.println("4. Mile => Kilometer (km = mile/0.621371)");
            System.out.println("0. Exit");
            String a = sc.nextLine().trim();
            ch = Integer.parseInt(a);
            if(ch==0){
                break;
            }
            String b = sc.nextLine().trim();
            double num = Double.parseDouble(b);

            switch (ch) {
                case 1:
                    System.out.printf("Result: %.2f%n", num * 1.8 + 32);
                    break;
                case 2:
                    System.out.printf("Result: %.2f%n", (num - 32) / 1.8);
                    break;
                case 3:
                    System.out.printf("Result: %.2f%n", num * 0.621371);
                    break;
                case 4:
                    System.out.printf("Result: %.2f%n", num / 0.621371);
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
            }
        }

        sc.close();
    }
}
