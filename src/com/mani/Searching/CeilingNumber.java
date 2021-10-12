package com.mani.Searching;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,4,9,14,16,18};
        int target = 15 ;

        int ceil = ceiling(arr,target);
        System.out.println(ceil);
    }

    // returning smallest number >= target
    static int ceiling(int[] arr, int target) {

       //but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0, end = arr.length-1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if( arr[mid] > target ){
                end = mid - 1;
            }else{
               return arr[mid];
            }
        }

        return arr[start];
    }
}
