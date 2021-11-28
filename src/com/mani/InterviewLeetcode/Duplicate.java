package com.mani.InterviewLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Duplicate {
    public static void main(String[] args) {
        int[] arr ={2,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public  static int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int i = 1,j = 1;
        while(i < nums.length){

            if(nums[i]  != nums[i-1]){
                nums[j] = nums[i];
                i++;
                j++;

            }else{
                i++;
            }
        }
        return j;

    }
}