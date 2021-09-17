package com.mani.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,32};
        int target = 22 ;
        int s =0,e=arr.length-1;
        System.out.println(binarySearch(arr,target,s,e));
    }

    static  int binarySearch(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return binarySearch(arr,target,mid+1,e);
        }

        return   binarySearch(arr,target,s,mid-1);
    }
}
