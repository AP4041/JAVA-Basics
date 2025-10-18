import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        scanner.close();
        
        int vowels = 0;
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        
        String lowerInput = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char lowerCh = lowerInput.charAt(i);
            
            if (Character.isLetter(ch)) {
                letters++;
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }
        
        String trimmedInput = input.trim();
        int words = 0;
        
        if (!trimmedInput.isEmpty()) {
            String[] wordArray = trimmedInput.split("\\s+");
            words = wordArray.length;
        }
        
        System.out.println("vowels=" + vowels);
        System.out.println("letters=" + letters);
        System.out.println("digits=" + digits);
        System.out.println("spaces=" + spaces);
        System.out.println("words=" + words);
    }
}

