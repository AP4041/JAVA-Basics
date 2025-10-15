package com.example;

import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        int vowels = 0;
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int words = 0;
        
        boolean inWord = false;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (Character.isLetter(ch)) {
                letters++;
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                }
                
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            }
            else if (Character.isDigit(ch)) {
                digits++;
                inWord = true;
            }
            else if (Character.isWhitespace(ch)) {
                spaces++;
                inWord = false;
            }
            else {
                inWord = true;
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