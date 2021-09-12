package com.mani.SortingAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
      int[] ans = new int[2];

        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int c = 0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index +1){
//                ans[c] = nums[index];
//                c++;
//                ans[c] = index+1;
                // or
                return new int[]{nums[index],index+1};
            }
        }

//      return ans;

        return (new int[]{-1,-1});
    }

    static  void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}