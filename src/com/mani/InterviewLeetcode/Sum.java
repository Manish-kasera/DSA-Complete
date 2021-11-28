package com.mani.InterviewLeetcode;
// https://leetcode.com/problems/sum-of-two-integers/
public class Sum {
    public static void main(String[] args) {
        System.out.println(getSum(2,3));
    }
    public static int getSum(int a, int b) {
        while (b != 0) {
            var carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }
}
