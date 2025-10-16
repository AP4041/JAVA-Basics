package com.example;

public class Q4 {
    public static void main(String[] args) {
        String text = "Java   is   cool";
        text = text.trim();

        char[] chars = text.toCharArray(); // تبدیل به آرایه‌ی کاراکترها
        String[] words = text.split("\\s+"); // جدا کردن کلمات بر اساس فاصله
        
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        int vowels = 0;
        int nonVowels = 0;
        int digits = 0;
        int spaces = 0;

        for (char c : chars) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else {
                nonVowels++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Non-Vowels: " + nonVowels);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Words: " + words.length);
    }
}
