package com.mani.BinarySearchPractice;

// https://leetcode.com/problems/single-element-in-a-sorted-array/
class SingleElement {

    public static void main(String[] args) {
       int[] nums = {1,1,2,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {

        int start=0;
        int end = nums.length - 1;

        while(start < end){
           if(nums[end] == nums[end-1]){
               end-=2;
           }else{
               return nums[end];
           }
        }
        // condition when element has only one element
        return nums[0];
    }
}