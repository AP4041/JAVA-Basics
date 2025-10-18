package com;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        System.out.println();
        rightTri(n , c);
        System.out.println();
        hollowSqr(n , c);
        System.out.println();
        xShape(n , c);
    }
    
    public static void rightTri(int n, char c){
        for( int i=1; i <= n; i++){
            for (int j=1; j <= i; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void hollowSqr(int n, char c){
        for( int i=1; i <= n; i++){
            for (int j=1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n ){
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void xShape(int n, char c){
        for (int i=0; i < n; i++){
            for(int j=0; j< n; j++){
                if(i == j || i + j == n - 1){
                    System.out.print(c);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
