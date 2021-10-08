package com.mani.BitAssignment;

import java.util.Arrays;
// https://leetcode.com/problems/counting-bits/

class CountBits {

    public static void main(String[] args) {
        int n = 2;
        int[] ans = new int[n+1];
        ans = countBits(5);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] countBits(int n) {
        int i = 0;
        int[] ans = new int[n+1];
        while(i<=n){
            ans[i] = count(i);
            i++;
        }
        return ans;
    }

    public static int count(int n) {

        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}