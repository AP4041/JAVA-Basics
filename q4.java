import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int vowels = 0;
        int letters = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
                char lower = Character.toLowerCase(ch);
                if (lower == 'a'  lower == 'e'  lower == 'i'  lower == 'o'  lower == 'u') {
                    vowels++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        String trimmedLine = line.trim();
        String[] words;
        if (trimmedLine.isEmpty()) {
            words = new String[0];
        } else {
            words = trimmedLine.split("\\s+");
        }
        int wordCount = words.length;

        System.out.println("vowels=" + vowels);
        System.out.println("letters=" + letters);
        System.out.println("digits=" + digits);
        System.out.println("spaces=" + spaces);
        System.out.println("words=" + wordCount);
        
        sc.close();
    }
}