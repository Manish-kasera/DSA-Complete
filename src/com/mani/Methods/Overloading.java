package com.mani.Methods;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//     fun(23);
//     fun("manish");
//     fun(10,20);

//        demo("Manish","sachin","Verma");
//        demo(293,3,3,4,32,2);
        // demo(); //reference to demo is ambiguou

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static  void fun(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...s){
        System.out.println(Arrays.toString(s));

    }

}
