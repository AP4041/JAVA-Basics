import java.util.Scanner;

public class p5 {
    Scanner input = new Scanner(System.in);
        showmeno();
        while(true)
        {
            int a = input.nextInt();
            switch(a)
            {
                case 1:{
                    System.out.println("enter celsius:");
                    double c = 0;
                    c = input.nextDouble();
                    System.out.format("fahrenheit = %.2f\n",c*1.8+32);
                    break;
                }
                case 2:
                {
                    System.out.println("enter fahrenheit:");
                    double f =0;
                    f = input.nextDouble();
                    System.out.format("celsius = %.2f\n",(f-32)/1.8);
                    break;
                }
                case 3:
                {
                    System.out.println("enter kilometer:");
                    double k = 0;
                    k = input.nextDouble();
                    System.out.format("mile = %.2f\n",k*0.621371);
                    break;
                    
                }
                case 4:
                {
                    System.out.print("enter mille:");
                    double m = 0;
                    m = input.nextDouble();
                    System.out.format("kilometer = %.2f\n", m/0.621371);
                    break;
                }
                case 0:
                {
                    System.out.print("bye!!!!\n");
                    return;
                }
                
            }
            
            
        }
        
    }
    public static void showmeno()
    {
        do{
            System.out.println("1.celsius ---> fahrenheit\n2.fahrenheit ---> celsius\n3.kilometer ---> mile\n4.mile---> kilometer\n0.EXIT\n");
        }while(false);
    }
    
    
}
