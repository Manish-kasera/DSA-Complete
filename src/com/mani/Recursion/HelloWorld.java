package com.mani.Recursion;

public class HelloWorld {
    public static void main(String[] args) {
        hello1();
    }

    static void hello1(){
        System.out.println("Hello World");
        hello2();
    }
    static void hello2(){
        System.out.println("Hello World");
        hello3();
    }
    static void hello3(){
        System.out.println("Hello World");
        hello4();
    }
    static void hello4(){
        System.out.println("Hello World");
        hello5();
    }
    static void hello5(){
        System.out.println("Hello World");
    }
}
