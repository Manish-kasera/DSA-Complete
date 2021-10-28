package com.mani.ArrayAssignment;

import java.util.Arrays;

class Merge {
    public static void main(String[] args) {
        int[] nums1 = {2,3,17,45,0,0,0};
        int m = 4;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1 2 3 0 0 0
        // 2 5 6

        int i = 0,j = 0,k = 0;
        int[] arr = new int[m+n];

        while(j < n && i < m){
         if(nums1[i] <= nums2[j]){
             arr[k] = nums1[i];
             i++;
         }else{
             arr[k] = nums2[j];
             j++;
         }
         k++;
        }

        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }
        System.out.println(arr);


    }
}