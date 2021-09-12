package com.mani.SortingAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumber {
    public static void main(String[] args) {

        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));



    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }

    static  void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}
