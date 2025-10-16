package com.example;

public class obj02 {
    public static void main(String[] args) {
        Person p1 = new Person();   // ساخت شیء
        p1.name = "Ali";
        p1.age = 25;
        p1.speak();  // خروجی: Ali is speaking.
        
    }



    public static class Person {
    // ویژگی‌ها
    String name;
    int age;

    // رفتار
    void speak() {
        System.out.println(name + " is speaking.");
    }

    }
 
}