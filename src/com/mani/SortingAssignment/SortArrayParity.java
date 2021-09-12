package com.mani.SortingAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-parity/

class SortArrayParity {

    public static void main(String[] args) {
       int[] nums = {3,1,2,4};
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sortArrayByParity(int[] nums) {

        int start = 0,end = nums.length-1;

        while(start< end){

            if(nums[start] % 2 != 0 && nums[end] % 2 == 0){
                swap(nums,start,end);
                start++;
                end--;
            }else if(start % 2 == 0){
                ++start;
            }else if(end % 2 != 0){
                --end;
            }
        }

        return nums;

    }

    static void swap(int[] nums, int start, int end) {
       int temp = nums[start];
       nums[start] = nums[end];
       nums[end] = temp;
    }
}