package com.example;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        
    
Scanner scanner=new Scanner(System.in);


int n=scanner.nextInt();

int []array=new int[n];
for(int i=0;i<n;i++)array[i]=scanner.nextInt();

sort(array);

for(int i=0;i<n;i++)System.out.print(array[i]+"  ");

scanner.close();;
    }   
    
    public static void sort(int[] arr) {

        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        
    }
}
