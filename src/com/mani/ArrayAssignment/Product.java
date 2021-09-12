package com.mani.ArrayAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/
class Product {

    public static void main(String[] args) {

        int[] arr = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums) {
        //Did Not Get Thata
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        //Calculating left value
        for(int i=1;i<n;i++){
            left[i] = nums[i-1]*left[i-1];
        }

        //Calculating the right value
        for(int i=n-2;i>=0;i--){
            right[i] = nums[i+1]*right[i+1];
        }

        //Calculating output
        for(int i=0;i<n;i++){
            output[i] = left[i]*right[i];
        }
        return output;
    }
}