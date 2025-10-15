package com.example;

import java.util.Scanner;

public class p10 {
    Scanner input = new Scanner(System.in);
        System.out.println("enter your size:");
        int n = input.nextInt();
        int a[][] = new int[n][n];
        getdigit(a,n);
        show(a,n);
        System.out.format("sum1 = %d\n ", sum1(a,n));
        System.out.format("sum2 = %d\n ", sum2(a,n));
        
    }
    
    
    
    
    
    
    
    
    
    public static void getdigit(int a[][],int n)
    {
        Scanner m = new Scanner(System.in);
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j] = m.nextInt();
                
            }
        }
    }
    public static void show(int a[][],int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sum1(int a[][], int n)
    {
        int sum = 0;
        for(int i = 0,j = 0 ; i<n ; i++,j++)
   
        {
            if(i==j)
            {
                sum = sum + a[i][j];
            }
        }
        return sum;

    }
        public static int sum2(int a[][], int n)
    {
        int sum = 0;
        for(int i = 0 ; i<n ; i++)
   
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 && j==n-1)
                {
                    sum = sum + a[i][j];
                    continue;
                }else
                    if(i==n-2 && j==n-2)
                    {
                        sum = sum + a[i][j];
                        continue;
                        
                    }else
                        if(i==n-1 && j==0)
                        {
                            sum = sum + a[i][j];
                        }
            }
            
        }
        return sum;

    }
}
