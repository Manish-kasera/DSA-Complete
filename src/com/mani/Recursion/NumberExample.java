package com.mani.Recursion;

public class NumberExample {
    public static void main(String[] args) {
        // write a function that takes a number and
        // print first 5 numbers

        print1(1);

    }

     static void print1(int n){
         System.out.println(n);
         print2(n+1);
    }

    static void print2(int n){
        System.out.println(n);
        print3(n+1);

    }
    static void print3(int n){
        System.out.println(n);
        print4(n+1);

    }
    static void print4(int n){
        System.out.println(n);
        print5(n+1);

    }
    static void print5(int n){
        System.out.println(n);
    }
}
