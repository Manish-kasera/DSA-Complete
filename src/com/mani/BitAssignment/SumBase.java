package com.mani.BitAssignment;
//https://leetcode.com/problems/sum-of-digits-in-base-k/
class SumBase {

    public static void main(String[] args) {
        System.out.println(sumBase(10,10));
    }

    public static int sumBase(int n, int k) {

        int sum = 0;
        while(n != 0){
            sum += (n % k);
            n /= k;
        }
        return sum;
    }
}