package com.mani.SortingAssignment;

import java.util.Arrays;

class MergeSorted {

    public static void main(String[] args) {

        int m = 0;
        int n = 1;
        int[] num1 = {0};
        int[] num2 = {1};
        int[] ans = merge(num1,m,num2,n);
        System.out.println(Arrays.toString(ans));

    }
   static int[] merge(int[] nums1, int m,int[] nums2, int n) {

       int j = 0;
        for(int i = m; i< m + n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        
        Arrays.sort(nums1);

        return nums1;
    }
}