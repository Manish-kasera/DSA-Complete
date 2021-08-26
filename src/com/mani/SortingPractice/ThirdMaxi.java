package com.mani.SortingPractice;

import java.util.Arrays;
import java.util.Collections;


//https://leetcode.com/problems/third-maximum-number/
public class ThirdMaxi {
    public static void main(String[] args) {
        int[] arr = { 1,2};

        int ans = thirdMax(arr);
        System.out.println(ans);

    }
    static int thirdMax(int[] nums) {

        int ans = Integer.MIN_VALUE;

        Arrays.sort(nums);

        int count = 1;
//        System.out.println(Arrays.toString(nums));
        for (int i = nums.length - 1; i > 0 ; i--) {
            if(nums[i] > nums[i-1]){
                count++;
                ans = nums[i-1];
                if(count == 3){
                    break;
                }
            }
        }
        return count ==3 ? ans : nums[nums.length -1];
    }
}
