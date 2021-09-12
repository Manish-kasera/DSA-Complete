package com.mani.SortingAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class MissingAll {

    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3};

        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(arr);

        System.out.println(ans);

    }


    public static  List<Integer>  findDisappearedNumbers(int[] nums) {

        List<Integer> li = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // just find Missing numbers
        for (int index = 0; index < nums.length ; index++) {
            if (nums[index] != index + 1) {
                 li.add(index + 1);
            }
        }

        return li;

    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}