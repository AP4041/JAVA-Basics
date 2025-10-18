package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();

        int vowels = 0;
        int letters = 0;
        int digits = 0;
        int space = 0;
        int words = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            if(Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch ==' ') {
                space++;
            }


            }
        String[] word = text.trim().split("\\s+");
        int wordCount = word.length;

        System.out.println("vowels: " + vowels);
        System.out.println("letters: " + (letters-vowels+digits));
        System.out.println("digits: " + digits);
        System.out.println("space: " + space);
        System.out.println("words: " + wordCount);

            sc.close();

}
}