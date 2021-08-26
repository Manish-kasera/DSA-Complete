package com.mani.SortingPractice;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {3,2,3};

        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] nums) {
        int ans;
        Arrays.sort(nums);

        ans = nums[nums.length/2];

        return ans;
    }
}
