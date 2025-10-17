import java.util.Scanner;
public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        int guess;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (true) {


            System.out.print("Guess? ");
            guess = sc.nextInt();
            attempts++;


            if (guess == secret) {
                System.out.println("🎉 Correct! The number was " + secret);
                System.out.println("Attempts: " + attempts);
                break;

            } else
            if (guess < secret) {
                System.out.println("Higher");
            } else
            {
                System.out.println("Lower");
            }
        }
        sc.close();
    }

}