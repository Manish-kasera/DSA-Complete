package com.mani.BitAssignment;
// https://leetcode.com/problems/number-of-1-bits/
public class Number1 {

    public static void main(String[] args) {
       int n = 11;
        System.out.println(hammingWeight(n));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int count = 0;
        while(n != 0) {
            n = n & (n-1); // Removes right set bit each time
            count++;
        }
        return count;
    }

}