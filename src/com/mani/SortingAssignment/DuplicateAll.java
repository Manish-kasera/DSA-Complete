package com.mani.SortingAssignment;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
class DuplicateAll {
    public static void main(String[] args) {
        int[] nums = {1};

        List <Integer> ans = new ArrayList<>();
        ans = findDuplicates(nums);
        System.out.println(ans);
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int i = 0;

        while(i < nums.length){

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
       // Getting Duplicate All
        for (int index = 0; index < nums.length ; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

      return ans;
    }

    static  void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}