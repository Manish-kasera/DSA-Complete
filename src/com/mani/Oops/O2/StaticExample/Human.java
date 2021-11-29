package com.mani.Oops.O2.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // static : It doesn't  depend on the Objects.
    static long population;

     static void message(){
        System.out.println("Hello World");
       
        // this represents an objects
        // but here is static method that means it doesn't
        // depend on an objects`
        // so i will give an error
//        System.out.println(this.age);
    }


    Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
