package com.example;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        
        int vowels = 0;
        int digits = 0;
        int spaces = 0;
        int otherLetters = 0;
        int words = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    digits++;
                    break;
                
                case ' ':
                    spaces++;
                    break;
                
                default:
                    switch (Character.getType(ch)) {
                        case Character.UPPERCASE_LETTER:
                        case Character.LOWERCASE_LETTER:
                            otherLetters++;
                            break;
                    }
                    break;
            }
        }
        
        if (!sentence.trim().isEmpty()) {
            String[] wordArray = sentence.trim().split("\\s+");
            words = wordArray.length;
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Letters: " + otherLetters);
        System.out.println("Words: " + words);
        
        scanner.close();
    }
}

