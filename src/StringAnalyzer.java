import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowels = 0;
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int words = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char smallCh = Character.toLowerCase(ch);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (smallCh == 'a' || smallCh == 'e' || smallCh == 'i' || smallCh == 'o' || smallCh == 'u') {
                    vowels++;
                } else {
                    letters++;
                }
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
                letters++;
            }
            else if (ch == ' ') {
                spaces++;
            }
        }

        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("vowels=" + vowels);
        System.out.println("letters=" + letters);
        System.out.println("digits=" + digits);
        System.out.println("spaces=" + spaces);
        System.out.println("words=" + words);
        scanner.close();
    }
}