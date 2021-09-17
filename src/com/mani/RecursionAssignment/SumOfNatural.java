package com.mani.RecursionAssignment;

//  https://leetcode.com/problems/reverse-string/

public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println(naturalSum(5));
    }

    public static int naturalSum(int n) {

        if(n <= 1){
           return 1;
       }
       else{
           return n + naturalSum(n-1);
       }
    }
}
