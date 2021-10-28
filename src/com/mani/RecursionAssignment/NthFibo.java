package com.mani.RecursionAssignment;

// https://leetcode.com/problems/fibonacci-number/

class NthFibo {

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }

    public static int fib(int n) {
      if( n == 0){
          return 0;
      }
      if (n == 1){
          return 1;
      }
      return fib(n-1) + fib(n-2);
    }
}