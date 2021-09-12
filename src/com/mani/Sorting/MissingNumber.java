package com.mani.Sorting;

public class MissingNumber {
    public static void main(String[] args) {

        int[]  arr = {1,2,0};
    }

    static void missingNumber(int[] nums){

        int i = 0,ans = -1;
        while(i < nums.length){

            // correct index for the  i th element
            int correct = nums[i] ;

            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length ; j++) {
            if(nums[j]!= j){
                ans = j;
            }
        }

        System.out.println(ans);

    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }


}