package com.example;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
    Random generetor=new Random();
Scanner scanner=new Scanner(System.in);
    int adad=generetor.nextInt(100);
    System.out.println(adad);

while (true) { 
    System.out.println("guess");

    int n=scanner.nextInt();
if(n==adad){
System.out.println("adad peyda shod=  "+adad);break;
}
if(n>adad){
    System.out.println("lower");
}
if(n<adad){
    System.out.println("higher");
}
}

    }
}
