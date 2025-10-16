package com.example;
import java.util.Scanner;

//import com.example.obj01.rectangle; wow

public class obj03 {
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
        System.out.println();

        rectangle rect2 = rect; // reference copy

        System.out.println("Area 2: " + rect2.calculateArea());
        System.out.println("Perimeter 2: " + rect2.calculatePerimeeter());
        System.out.println();

        System.out.println("Now changing rect2...");
        rect2.setLength(3);
        rect2.setWidth(5);
        System.out.println("Area 2: " + rect2.calculateArea());
        System.out.println("Perimeter 2: " + rect2.calculatePerimeeter());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeeter());

        System.out.println();
        System.out.println("Now we see, rect and rect2 are the same object");


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