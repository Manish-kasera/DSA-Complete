package com.mani.BinarySearch;

import java.util.Arrays;

public class FirstLastBrute {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ind = firstLastBrute(arr,target);
        System.out.println(Arrays.toString(ind));
    }

    private static int[] firstLastBrute(int[] arr,int target) {

        int[] ans = {-1,-1};
        int start = -1 ,end = -1;
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] == target){
                end = i;

            }
            if(arr[arr.length -1 - i] == target){
                start = arr.length - i -1;

            }
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
}
