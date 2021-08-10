package com.mani.Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,4,8,2334,34,3423,14);
//        fun();
//        multiply(2,27,"Kunal","Manish"); //ordering is inportant

//        random(10,37,33);
    }

    //mix of arguments

    static  void multiply(int a ,int b ,String...v){

    }

    //error
//    static  void random(int a ,int ...v,int b){ //Vararg parameter must be the last in the list
//
//    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
