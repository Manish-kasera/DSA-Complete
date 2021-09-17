package com.mani.BinarySearchPractice;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

import com.mani.Basic_Java_Program.AreaOfEquilateralTriangle;

class MinEle {

    public static void main(String[] args) {
        int[] nums = {3,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
//        int start = 0;
//        int end = nums.length -1;
//
//        if(nums[end] > nums[start] || nums.length == 1){
//            return  nums[start];
//        }
//        int ans = -1;
//        while (start< end){
//
//            int mid = start + (end- start)/2;
//
//            if(nums[mid] > nums[mid+1]){
//                ans = nums[mid+1];
//                end = mid ;f
//            }else{
//                start = mid+1;
//            }
//        }

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else right = mid;
        }
        return nums[left];
//        return ans;
    }
}