package com.example;

import java.util.Scanner;

public class p3 {
    Scanner input = new Scanner(System.in);
        
        
        float a;
        float b;
        
        while(true)
        {
            System.out.print("\nenter operator(+ , - , * , / , % ) or 0 for EXIT :");
            char c = input.next().charAt(0);
            if(c=='0')
            {
                System.out.print("bye!\n");
                break;
            }
            System.out.print("\nenter a:");
        
            a = input.nextFloat();
            System.out.print("\nenter b:");
            b = input.nextFloat();
            
            
            switch(c)
            {
                case '+':
                    System.out.format("%f + %f = %f",a,b, a+b);
                    break;
                    
                case  '-':
                    System.out.format("%f - %f = %f",a,b, a-b);
                    break;
                case '*':
                    System.out.format("%f * %f = %f",a,b, a*b);
                    break;
                case '/':
                    if(b==0)
                    {
                        System.out.print("Erorrrr!!!!");
                        break;
                    }else{
                        System.out.format("%f / %f = %f",a,b,a/b);
                        break;
                        
                    }
                
                case '%':
                    if(b==0)
                    {
                        System.out.print("Erorrrr!!!!");
                        break;
                        
                    }else{
                        System.out.format("%f mod %f = %f",a,b,a%b);
                        break;
                        
                        
                    }
                
                    
            }
        }
    }
    
}
