package com.mani.ArrayAssignment;
// https://leetcode.com/problems/sort-array-by-parity-ii/

import java.util.Arrays;

class Array2 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    public static int[] sortArrayByParityII(int[] nums) {

        for (int even = 0,odd = 1; even < nums.length && odd < nums.length ; ) {
            if (nums[even] % 2 != 0 && nums[odd] % 2 == 0){
                swap(even,odd,nums);
            }else if(nums[even] % 2 == 0 ){
               even += 2;
            }else if(nums[odd] % 2 != 0){
                odd += 2;
            }
        }

        return nums;
    }

    public static void swap(int even, int odd,int[] nums) {
      int temp = nums[even];
      nums[even] = nums[odd];
      nums[odd] = temp;
    }
}