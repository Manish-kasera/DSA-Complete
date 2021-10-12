package com.mani.ArrayAssignment;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {

        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {

     // [2,7,11,15] tar = 9;

        Arrays.sort(nums);
        int start = 0,end = nums.length-1;
        while(start< end){

            if((nums[start] + nums[end] )== target){
                return new int []{start,end};
            }else if(nums[start] + nums[end] < target){
                start++;
            }else{
                end--;
            }

        }
      return new int[] {-1,-1};
    }
}
