package com.mani.SortingAssignment;

import java.util.Arrays;
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};

        int k = 4;
        System.out.println(findKthLargest(arr,k));
    }

    static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }


}