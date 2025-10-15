package com.example;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        int x = 10;
        fibo(x);

    }


    static void fibo(int a) {
        int temp = 0;
        int i = 0;
        int j = 1;
        int b = 1;
        System.out.print(0);
        System.out.print(" , ");
        fiboNa(a,b,i,j,temp);
        
    }
    
    
    static void fiboNa(int a , int b , int i , int j , int temp) {
        if (b <= a) {
            temp = i + j;
            i = j;
            j = temp;
            if (b == a)
                System.out.print(i);
            else
                System.out.print(i + " , ");
            
            fiboNa(a,++b,i,j,temp);
        }
        
        
    }
  
}