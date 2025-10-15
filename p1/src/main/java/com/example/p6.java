package com.example;

import java.util.Scanner;

public class p6 {
    Scanner input = new Scanner(System.in);
        System.out.println("enter size = ");
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<a.length ; i++)
        {
            a[i] = input.nextInt();
        }
        sort(a,n);
        System.out.print("enter key:");
        int key = input.nextInt();
        lsearch(a,n,key);
        
        show(a,n);
        
    }
    public static void sort(int a[],int s)
    {
        /*for(int i=0 ; i<s-1 ; i++)
        {
            for(int j=0 ; j<s-1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    
                }
            }
        }*/
        
        for(int i=1 ; i<s ; i++)
        {
            int j = i-1;
            int key = a[i];
            
            
            while(j>=0 && key <= a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            
        }
    }
    public static void show(int a[] , int b)
    {
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.format("%d ",a[i]);
            
        }
        System.out.println();
    }
    
    
    
    public static void lsearch(int a[],int c , int key)
    {
        boolean u = false;
        int z = 0;
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]==key)
            {
                z = i;
                u = true;
                
            }
            
            
        }
        if(u)
        {
            System.out.format("founded in %d\n",z);
            
            
            
        }else{
            System.out.println("not founded\n");
            

            
        }
        
    
}
