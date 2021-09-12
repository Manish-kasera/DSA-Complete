package com.mani.BinarySearch;

public class PeakIndexBrute {
    public static void main(String[] args) {

        int[] arr = {24,69,100,99,79,78,67,36,26,19};

        int ele = peakIndexInMountainArray(arr);
        System.out.println(ele);
    }

     static int peakIndexInMountainArray(int[] arr) {
       int ans = -1;

         for (int i = 1; i < arr.length - 1 ; i++) {
             if( arr[i] >arr[i-1]){

                 if(arr[i+1] < arr[i]){
                     ans = i;
                 }
             }
         }
        return ans;
    }

}
