package com;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine().trim();
        int n= Integer.parseInt(str);
        int[] numbers= new int[n];
        for (int i=0;i<n;i++){
            String strg= scanner.nextLine().trim();
            numbers[i]= Integer.parseInt(strg);
        } 
        SumAvg(numbers);
        MinMax(numbers);
        scanner.close();
    }
    static void SumAvg(int[] m){
        int s=0;
        for(int i=0; i < m.length; i++){
            s += m[i];
        }
        System.out.println("sum=" + s);
        System.out.println("avg=" + (double)s / m.length);
    }

    static void MinMax(int [] r){
        int min=0;
        int max=0;
        if(r.length>1){
            for(int i=0; i < r.length; i++){
                if(r[i] > max){
                    max=r[i];
                } else if( r[i] < min){
                    min = r[i];
                }
            }
        }else if( r.length == 1){
                min = r[0];
                max = r[0];
            }
            System.out.println("min=" + min);
            System.out.println("max=" + max);
        }
    }
    
