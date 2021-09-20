package com.mani.Recursion;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibo(5));

        System.out.println(fiboFormula(5));
    }

    public static int fiboFormula(int n){

         return Math.pow((1 + Math.sqrt(5))/2,n) - Math.pow((1 - Math.sqrt(5))/2,n);

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
