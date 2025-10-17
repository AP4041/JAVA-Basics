 import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🟣 گرفتن عدد n و کاراکتر c از کاربر
        int n = input.nextInt();   // مثلا 4
        char c = input.next().charAt(0);  // مثلا #

        // --------------------------------------------------------
        // 1️⃣ الگوی اول: مثلث راست
        // --------------------------------------------------------
        for (int i = 1; i <= n; i++) {   // از خط 1 تا خط n
            for (int j = 1; j <= i; j++) { // در هر خط i تا کاراکتر چاپ کن
                System.out.print(c);
            }
            System.out.println(); // برو خط بعد
        }

        System.out.println(); // فاصله بین الگوها

         
         
        
        for (int i = 1; i <= n; i++) {       // سطرها
            for (int j = 1; j <= n; j++) {   // ستون‌ها
                
                if (i == 1  ||i == n || j == 1 || j == n) {
                    System.out.print(c);
                } else {
                    System.out.print(" "); // داخل مربع خالی
                }
            }
            System.out.println();
        }

        System.out.println(); // فاصله بین الگوها

        
        for (int i = 0; i < n; i++) {           
            for (int j = 0; j < n; j++) {      // ستون‌ها
              
                if (i == j || i + j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");  
                }
            }
            System.out.println();
        }

        input.close();
    }
}
    

