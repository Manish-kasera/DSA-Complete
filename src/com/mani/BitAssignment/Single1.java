package com.mani.BitAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/single-number/
class Single1 {
    public static void main(String[] args) {
        int[]  nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        int ans = 0;

        for(int i:nums){
            ans ^= i;
        }
        return ans;
    }
}