package com.example;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("enter a text : ");
    String text = scanner.nextLine();

    int vowels = 0;
    int letters = 0;
    int digits = 0;
    int spaces = 0;
    int words  =0;
     for(int i=0 ; i<text.length(); i++){
        char c = text.charAt(i);
        if(Character.isLetter(c)){
        letters++;
        c = Character.toLowerCase(c);
        if(c== 'a'|| c == 'i' || c== 'o' || c=='u' || c== 'e')
        vowels++;
        }
        else if (Character.isDigit(c))
        digits++;
        else if (Character.isWhitespace(c)) 
        spaces++;
            
        }

        String trimmed = text.trim();
        if(!trimmed.isEmpty()){
            String [] parts = trimmed.split("\s+");
            words = parts.length;

        }
        System.out.println("vowels:" + vowels);
        System.out.println("letters:" + letters);
        System.out.println("digits:" + digits);
        System.out.println("spaces;"+ spaces);
        System.out.println("words:"+ words);

        scanner.close();
     }

        
    }

    
    

