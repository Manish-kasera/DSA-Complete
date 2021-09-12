package com.mani.SortingAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] nums) {

        int i = 0;
        while(i < nums.length){

            // correct index for the  i th element
            int correct = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correct]  ){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
       int ans = check(nums);

        return ans;
    }

    static int check(int[] nums) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                ans = i;
            }
        }
        return ans;
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}
