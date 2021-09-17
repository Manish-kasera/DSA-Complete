package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1333));
    }

    private static int sumOfDigits(int n) {
      if(n==0){
          return 0;
      }
        return (n % 10 + sumOfDigits(n/10));
    }
}
