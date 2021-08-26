package com.mani.BinarySearch;

import java.util.Arrays;

public class BinarySearchDesc {
    public static void main(String[] args) {

        int[] arr = {20,12,8,6,3,2,1};
        int target = 92;


        int ind = binarySearchDesc(arr,target);
        System.out.println(ind);
    }

    static int binarySearchDesc(int[] arr,int target){

        int start = 0,end = arr.length - 1;

        while(start <= end){
            int mid =  start +( end- start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;

    }
}
