package com;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int vowels =0;
        int letters=0;
        int digits=0;
        int spaces=0;
        int words=0;

        String lowerInput = input.toLowerCase();
        for(int i=0; i < input.length(); i++){
            char c= input.charAt(i);
            char lowerC = lowerInput.charAt(i);

            if(Character.isLetter(c)){
                letters++;

                if(lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u'){
                    vowels++;
                }
            } else if ( Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            }
        }
        String str = input.trim();
        if(!str.isEmpty()){
            String[] st=str.split("\\s+");
            words=st.length;
        }
        System.out.println("vowels=" + vowels);
        System.out.println("letters=" + letters);
        System.out.println("digits=" + digits);
        System.out.println("spaces=" + spaces);
        System.out.println("words=" + words);

        sc.close();
    }
}
    

