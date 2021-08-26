package com.mani.SortingPractice;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {3,1,2,34,3};

        System.out.println(containsDuplicate(arr));

    }

    static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i=1; i <= nums.length - 1;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
