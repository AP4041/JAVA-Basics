package com.example;
import java.util.Scanner;

public class obj01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // creating an object of rectangle
        rectangle rect  = new rectangle();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        rect.setWidth(w);
        rect.setLength(l);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeeter());

        sc.close();
    }


    // defining a rectangle class
    public static class rectangle {
        // private properties
        private int width , length;

        // public behaviors
        public void setWidth(int w) {
            width = w;
        }
        public void setLength(int l) {
            length = l;
        }
        public int calculateArea() {
            return width * length;
        }
        public int calculatePerimeeter() {
            return 2 * (width + length);
        }

    
    }

}