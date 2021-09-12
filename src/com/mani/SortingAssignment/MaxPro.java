package com.mani.SortingAssignment;

import java.util.Arrays;

public class MaxPro {

    public static void main(String[] args) {

        int[] arr = {
                1,5,4,10
        };
        System.out.println(maxProduct(arr));
    }

    static int maxProduct(int[] nums) {

//        Arrays.sort(nums);
//        int n = nums.length;
//        return ((nums[n-1] -1) * (nums[n - 2] - 1));

        int firstMax = 0;
        int secMax = 0;

        for(int i = 0; i<nums.length ;i++){
            if( nums[i] >= firstMax){
                secMax = firstMax;
                firstMax = nums[i];
            }
            else if(nums[i] >secMax && nums[i] <=firstMax){
                secMax = nums[i];
            }
        }
        return ((firstMax-1)*(secMax -1));

    }
}
