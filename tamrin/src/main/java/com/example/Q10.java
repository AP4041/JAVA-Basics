package com.example;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter n: ");
        int n = scanner.nextInt();

        int mainDiagonalSum =0;
        int secondaryDiagonalSum=0;
        
        for(int i=1 ; i <= n ; i++){
            for(int j=1 ; j <= n ; j++){
                int valu = i*j;
                System.out.print(valu);
                if(j != n)
                System.out.print("   ");
                if( i== j)
                mainDiagonalSum +=valu;
                if( i+j == n+1)
                secondaryDiagonalSum += valu;
            }
            System.out.println();
        }
        System.out.println("mainDiagonalSum=" + mainDiagonalSum);
        System.out.println("secondaryDiagonalSum=" + secondaryDiagonalSum);
        scanner.close();

    }
    
}
