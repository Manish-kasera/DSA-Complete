package com.mani.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

//        int[] nums = {1,5,4,3,2,6};

//        int[] arr = cyclicSort(nums);
//        System.out.println(Arrays.toString(arr));

//        sort(nums);
//        System.out.println(Arrays.toString(nums));

        int[] nums = {3,0,1};

        System.out.println(Arrays.toString(nums));

    }


    static void sort(int[] nums){

        int i = 0;       while(i < nums.length){

            // correct index for the  i th element
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }

    }



    static void swap(int[] arr, int i, int correct) {
         int temp = arr[i];
         arr[i] = arr[correct];
         arr[correct] = temp;
    }

    static int[] cyclicSort(int[] arr) {

        int i = 0,n = arr.length;

        // index = value - 1

        // loop through the entire array
        while(i < n){
            // 3 5 2 1 4

           if(arr[i] != arr[arr[i]-1]){
               int temp = arr[i];
               arr[i] = arr[arr[i] - 1];
               arr[temp-1] = temp;
           }else{
               i++;
           }
        }

        return arr;
     }
}
