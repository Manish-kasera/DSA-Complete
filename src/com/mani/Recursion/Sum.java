package com.mani.Recursion;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if( n <= 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
