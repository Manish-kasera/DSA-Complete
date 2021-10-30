package com.mani.Recursion.Easy;

public class NumberExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first five number

        number1(1);
    }

    public static void number1(int num) {
        System.out.println(num);
        number2(num+=1);
    }
    public static void number2(int num) {
        System.out.println(num);
        number3(num+=1);
    }
    public static void number3(int num) {
        System.out.println(num);
        number4(num+=1);
    }
    public static void number4(int num) {
        System.out.println(num);
        number5(num+=1);
    }
    // func body here changes
    public static void number5(int num) {
        System.out.println(num);
    }
}
