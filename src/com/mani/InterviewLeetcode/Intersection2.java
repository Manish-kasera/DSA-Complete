package com.mani.InterviewLeetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class Intersection2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] arr = intersect(nums1,nums2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> arr1 = new ArrayList<>();
       ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < nums1.length ; i++) {
            arr1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length ; i++) {
            arr2.add(nums2[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr1.size() < arr2.size()){
            for (int i = 0; i < arr1.size(); i++) {
                for (int j = 0; j < arr2.size() ; j++) {
                    if(Objects.equals(arr1.get(i), arr2.get(j))){
                       ans.add(arr1.get(i));
                        arr2.remove(j);
                        break;
                    }
                }
            }
        }else{
            for (int i = 0; i < arr2.size(); i++) {
                for (int j = 0; j < arr1.size() ; j++) {
                    if(Objects.equals(arr1.get(j), arr2.get(i))){
                        ans.add(arr2.get(i));
                        arr1.remove(j);
                    }
                }
            }
        }

        int[] arr = new int[ans.size()];
        int i=0;
        while(!ans.isEmpty()){
            arr[i] = ans.get(0);
            ans.remove(0);
            i++;
        }

       return  arr;
    }

}
