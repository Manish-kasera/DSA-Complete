package com.mani.Methods;

public class Shadowing {
    static int x = 90 ; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x ; // the class variable in line 4 is shadowed by this variable
//        System.out.println(x); // error scope will begin when value is initialised
        x = 100;        System.out.println(x); //100
        fun();
    }

    static void fun(){
        System.out.println(x);// 90
    }
}
