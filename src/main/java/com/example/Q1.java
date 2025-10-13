package com.example;

import java.util.Scanner;

public class Q1 {
   public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
int []array=new int[n];
 
float avr,min,max,sum=0;;
for(int i=0;i<n;i++)array[i]=scanner.nextInt();
min=array[0];
max=array[0];
for(int i=0;i<n;i++)sum=sum+array[i];

for(int i=0;i<n;i++){
    if(min<array[i])min=array[i];
}
for(int i=0;i<n;i++){
    if(max>array[i])min=array[i];
}


avr=sum/n;
System.err.print("sum=");
System.err.println(sum);
System.err.print("avr=");
  System.out.printf("avr = %.2f%n", avr);

System.out.print("min=");
System.out.println(min);

System.out.print("max=");
System.out.println(max);

scanner.close();
   }
}
