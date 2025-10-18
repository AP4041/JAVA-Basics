package com.example;
import java.util.Scanner;

public class Q4 {

    static void vowels(String input) {
        int index = 0;
        String vowels = "aeiouAEIOU"; 

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                index++;
            }
        }
        System.out.println("vowels=" + index);
    }

    static void otherLetters(String input) {
        int index = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && "aeiouAEIOU".indexOf(input.charAt(i)) == -1) {
                index++;
            }
        }
        System.out.println("letters=" + index);
    }
    
    static void digit(String input) {
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                index++;
            }
        }
        System.out.println("digits=" + index);
    }

    static void spaces(String input) {
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                index++;
            }
        }
        System.out.println("spaces=" + index);
    }

    static void words(String input) {
        String[] wordArray = input.trim().split("\\s+");
        System.out.println("words=" + wordArray.length);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        input = input.toLowerCase();

        vowels(input);
        otherLetters(input);
        digit(input);
        spaces(input);
        words(input);
    }
}
