package com.mani.Bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        // number
        int n = 14;

        // base
        int b = 2;

        int ans = (int) (Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}
