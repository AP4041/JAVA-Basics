import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int randomNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;
        
        System.out.println(">>>>>I'm thinking of a number between 1 and 100. Can you guess it?");
        
        while (guess != randomNumber) {
            System.out.print(">>>>Guess? ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Higher");
            } else if (guess > randomNumber) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("Attempts: " + attempts);
            }
        }
        
        scanner.close();
    }
}
