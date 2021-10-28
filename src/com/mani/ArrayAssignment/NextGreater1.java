package com.mani.ArrayAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/next-greater-element-i/
class NextGreater1 {

    public static void main(String[] args) {

        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nums1 = [4,1,2], nums2 = [1,3,4,2]

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i] == nums2[j]){
                    ans[i] = greater(nums2,nums1[i],j);
                }
            }
        }
        return ans;
    }

    public static int greater(int[] nums2, int ele,int j) {
        for (int i = j; i < nums2.length ; i++) {
            if(nums2[i] > ele){
                return nums2[i];
            }
        }
        return -1;
    }
}