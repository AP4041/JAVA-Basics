import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        int vowels = 0;
        int letters = 0;
        int digits = 0;
        int spaces = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
        }

        String[] words = text.trim().split("\\s+");
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

        System.out.println("vowels=" + vowels);
        System.out.println("letters=" + letters);
        System.out.println("digits=" + digits);
        System.out.println("spaces=" + spaces);
        System.out.println("words=" + wordCount);

        input.close();
    }
}