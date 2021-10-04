package com.mani.Recursion;

public class Nto1 {
    public static void main(String[] args) {

        int n = 5;
//        fun(n);

//        funRev(n);

        funBoth(n);
    }

    public static void funBoth(int n) {
        if( n == 0){
          return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);

    }

    // 5 4 3 2 1
    public  static void fun(int n){

        if(n == 1){
            System.out.print("1"+" ");
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }

    // 1 2 3 4 5
    public  static void funRev(int n){

        if(n == 1){
            System.out.print("1"+" ");
            return;
        }
        funRev(n-1);
        System.out.print(n+" ");
    }
}
