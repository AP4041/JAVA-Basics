import java.util.*;

public class P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        char c;
        System.out.println("enter size :");
        n = input.nextInt();
        System.out.println("enter char :");
        c = input.next().charAt(0);
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();

        }
        System.out.println();

        square(n, c);
        System.out.println();
        x(n, c);
        System.out.println();

    }

    public static void square(int a , char b)
    {
        for(int i=1 ; i<=a ; i++)
        {
            for(int j=1 ; j<=a ; j++)
            {
                if(i==1  i==a)
                {
                    System.out.print(b);
                }
                
                if(i<a && i>1)
                {
                    if(j==1  j==a)
                    {
                        System.out.print(b);
                    }else{
                        System.out.print(' ');
                    }
                }
                
            }
            System.out.println();
            
        }
    }

    public static void x(int a , char b)
    {
        for(int i=1 ; i<=a ; i++)
        {
            for(int j=1 ; j<=a ; j++)
            {
                if(i==1  i==a)
                {
                    if(j==1  j==a)
                    { 
                        System.out.print(b);
  
                    }
                    else
                    {
                    System.out.print(" ");
                    }
                }
                
                
                if(i>1 && i<a)
                {
                    if(j==1 || j==a)
                    {
                        
                        System.out.print(" ");
  
                    }else
                    {
                        System.out.print(b);
                    }
                }
            }
            System.out.println();
        }
    }

}