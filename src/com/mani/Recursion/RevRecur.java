package com.mani.Recursion;

public class RevRecur {
    public static void main(String[] args) {
        System.out.println(rev(98234));
    }

    public  static int rev(int num){
        // sometimes you might need some additional variables in the argument
        // in that case,make another helper function
        int digits = (int) (Math.log(num)/Math.log(10))+1;
        return helper(num,digits);
    }

    public static int helper(int num, int digits) {
        if(num % 10 == num){
            return num;
        }

        int rem = num % 10;
        return (int) (rem * Math.pow(10,digits-1) + helper(num/10,digits-1));
    }
}
