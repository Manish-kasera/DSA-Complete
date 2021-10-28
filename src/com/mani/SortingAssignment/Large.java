package com.mani.SortingAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/largest-number/
class Large {
    public static void main(String[] args) {

        int[] arr={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums) {

      StringBuilder build = new StringBuilder();
      if(nums.length == 1){
          return String.valueOf(nums[0]);
      }
      Arrays.sort(nums);

        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
             if(nums[i] > nums[index] && nums[i] < 10){
                 index = i;
             }
        }

        for (int i = index; i >=0 ; i--) {
            build.append(nums[i]);
        }
        for (int i = nums.length - 1; i > index ; i--) {
            build.append(nums[i]);
        }

        return String.valueOf(build);
    }
}