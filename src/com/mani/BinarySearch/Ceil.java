package com.mani.BinarySearch;

public class Ceil {
    public static void main(String[] args) {
        int[] arr= {2,3,5,9,11,14,1623,1803};
        int target = 1700;

        int ceil = ceilingElement(arr,target);
        System.out.println(ceil);
    }



    // return the smallest element no >=target
    static int ceilingElement(int[] arr, int target) {

        int start = 0,end = arr.length - 1;
        int mid;

        while (start <= end){

            // if target is already greatest elemnet
            if(target > arr[arr.length - 1]){
                return -1;
            }
            mid = start + (end - start)/2;

            if(target == arr[mid])
                return arr[mid];
            else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        int ceil = arr[start];
        return ceil;
    }
}
