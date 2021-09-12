package com.mani.SortingAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxOf3 {
    public static void main(String[] args) {

        int[] nums = {-100,-98,-1,2,3,4};
         int ans = maximumProduct(nums);
        System.out.println(ans);

    }
    static  int maximumProduct(int[] nums) {

        Arrays.sort(nums);

//        int ans = 1;
//
//        if(nums[0] < 0 && nums[1] < 0 ){
//            ans = nums[0] * nums[1] * nums[nums.length -1];
//        }else {
//            ans = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
//        }

        int ans = 1;

        ans = nums[0] * nums[1] * nums[nums.length - 1];

        return ans;

    }
}
