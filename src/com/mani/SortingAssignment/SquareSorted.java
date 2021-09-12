package com.mani.SortingAssignment;

import java.util.Arrays;
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquareSorted {

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,4,6,8};
        int [] ans = squareSorted(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] squareSorted(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }


}
