package com.mani.SortingAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class IntersectionArray1 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }


        public  static int[] intersection(int[] nums1, int[] nums2) {

            Set <Integer> set1 = new HashSet<>();
            Set <Integer> set2 = new HashSet<>();

            for(int i:nums1){
                set1.add(i);
            }

            for(int i:nums2){
                set2.add(i);
            }

            ArrayList <Integer> arr = new ArrayList<>();

            for(int i : set1){
                 if(set2.contains(i)){
                     arr.add(i);
                 }

            }

            int[] ar = new int[arr.size()];

            int i=0;
            for(int e: arr){
                ar[i] = e;
                i++;
            }
            return ar;
    }
}