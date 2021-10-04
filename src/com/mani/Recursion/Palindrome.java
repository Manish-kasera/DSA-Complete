package com.mani.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(124421));
    }

    public static  boolean palin(int n){
      return  n == rev(n);
    }

    public  static  int rev(int num){
        int dig = (int) (Math.log(num)/Math.log(10)) + 1;
        return helper(num,dig);
    }

    public static int helper(int num, int dig) {
        if(num % 10 == num){
            return num;
        }
        int rem = num % 10;
        return (int) (rem * Math.pow(10,dig-1) + helper(num/10,dig-1));
    }

}
