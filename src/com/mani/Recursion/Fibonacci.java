package com.mani.Recursion;

public class Fibonacci {

    public static void main(String[] args) {

//        System.out.println(fibo(5));

//        for (int i = 0; i < 11 ; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }

    public static int fiboFormula(int n){

        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }

    static int fibo(int n){

        //0 1 2 3 4 5 6 7 8
       // 0 1 1 2 3 5 8 13 21

       // base condition
       if(n < 2)
           return n;

        return  fibo(n-1)+fibo(n-2);

    }
}
