import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
            System.out.println("prime ("+ number +")=" +  isPrime(number));
        System.out.println("primes<="+number+": ");
        for (int i = 2; i < number; i++) {
            isPrime(number);
            for (int j = 2; j * j < i; j++) {
                isPrime (number);
                break;
            }

            if (isPrime(number)) {
                System.out.println(i + " ");
            }
        }
        int x=a,y=b;
        while (y !=0){
            int t = x%y;
            x = y;
            y = t;
        }
        int gcd = x;
        int lcm = (a*b)/gcd;
        System.out.println("gcd("+ a +" , "+ b +") = " + gcd);
        System.out.println("lcm("+ a +" , " + b +") = " + lcm);

        sc.close();
    }
    static boolean isPrime(int number){
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;

        }    return true;
    }
}