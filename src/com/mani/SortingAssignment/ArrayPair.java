package com.mani.SortingAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/array-partition-i/
class ArrayPair {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i+=2) {
            sum += Math.min(nums[i],nums[i+1]);
        }

        return sum;
    }
}