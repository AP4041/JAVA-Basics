package com.example;

public class Wrong_Q4 {
    public static void main (String args[]){
        String text = "Java   is   cool";
        text =text.trim();
        String[] words = text.split("");
        String[] Words = text.split("\\s+");

        for (String w : words) {
            System.out.println(w);
        }
        int vowels = 0;
        int nonVowels = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0 ; i < words.length; i++) {
            if (words[i] == "a" || words[i] == "A" || words[i] == "e" || words[i] == "E" || words[i] == "i" || words[i] == "I" || words[i] == "o" || words[i] == "O" || words[i] == "u" || words[i] == "U") {
                vowels++;
            }
            else{
                nonVowels++;
            }
            
            if (words[i] == "1" || words[i] == "2" || words[i] == "3" || words[i] == "4" || words[i] == "5" || words[i] == "6" || words[i] == "7" || words[i] == "8" || words[i] == "9" || words[i] == "0") {
                digits++;
            }

            if (words[i] == " ") {
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Non-Vowels: " + nonVowels);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Words: " + Words.length);


        
    }
    
}
