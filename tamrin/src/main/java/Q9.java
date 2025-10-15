import java.util.*;

public class Q9 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int r = rnd.nextInt(100);

        while(true)
        {
            System.out.println("enter your gusses:");
            int g = input.nextInt();
            if(g==r)
            {
                System.out.println("yes");
                break;
            }else{
                if(g>r)
                {
                    System.out.println("lower");


                }else
                if(g<r)
                {
                    System.out.println("higher");

                }
            }

        }
    }

}