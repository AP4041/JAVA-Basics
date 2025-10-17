package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        char c;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=sc.next().charAt(0);
        System.out.println(c);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            if( i==1|| i==n){
                for(int j=1;j<=n;j++){
                    System.out.print(c);
                }
            }else{
                System.out.print(c);
                for(int x=1;x<=n-2;x++){
                    System.out.print(' ');
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print(c);
                } else if (i+j==n+1) {
                    System.out.print(c);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}