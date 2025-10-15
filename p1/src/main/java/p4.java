import java.util.Scanner;

public class p4 {
    Scanner input = new Scanner(System.in);
        System.out.println("enter your sentence:");
        String s = input.nextLine();
        int c=0,k=0,o=0,y=0,l=0;
        for(int j=0 ; j<s.length();j++)
        {
            if(Character.isDigit(s.charAt(j)))
            {
                y++;
            }

        }
        
        
        
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='o')
            {
                c++;
            }else
            if(s.charAt(i)==' ')
            {
                o++;
                
            }else{
                k++;
            }
        }
        l = o+1;
        System.out.format("number of vowels = %d\n\nnumber of othe letters = %d\n\nnumber of space = %d\n\nnumber of digit = %d\n\nnumber of word = %d\n\n", c,k,o,y,l);
        
        
    
}
