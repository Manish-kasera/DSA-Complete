package com.mani.RecursionAssignment;

// https://leetcode.com/problems/fibonacci-number/

class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n) {

       if(n < 2){
           return n;
       }
        return fib(n-1)+ fib(n-2);
    }
}