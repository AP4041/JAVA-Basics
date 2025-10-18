import java.util.Random;
import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; int guess; boolean gameover = false; int tries = 0;
        Random rand = new Random();
        n = rand.nextInt(100) + 1;
        while(!gameover) {
            System.out.print("Enter Your guess (1-100): ");
            guess = sc.nextInt();
            tries++;
            if(guess == n) {
                gameover = true;
                System.out.println("Congratulations! You win!");
                System.out.println("It took " + tries + " tries.");
            }
            else if(guess > n) {
                System.out.println("Lower");
            }
            else {
                System.out.println("Higher");
            }
        }
    }
}
