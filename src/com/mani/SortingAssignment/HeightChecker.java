package com.mani.SortingAssignment;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class HeightChecker {

    public static void main(String[] args) {
        int[] arr = {2,1,2,1,1,2,2,1};

        int ans = height(arr);
        System.out.println(ans);
    }

    static int height(int[] arr) {

      int count = 0;
      int temp[] = arr.clone();

        Arrays.sort(temp);

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != temp[i]){
                count++;
            }

        }
       return  count;
    }
}
