import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        int words = 0;
        int otherLetters = 0;
        int digits = 0;
        int spaces = 0;
        int vowels = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Text: ");
        String text = sc.nextLine();
        for (char c : text.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == ' ') {
                spaces++;
            }
            else if (Character.isDigit(c)) {
                digits++;
            }
            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            else {
                otherLetters++;
            }
        }
        String[] Word = text.trim().split("\s+");
        for(String word : Word) {
            words++;
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of words: " + words);
        System.out.println("Number of others: " + otherLetters);
    }
}