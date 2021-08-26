package com.mani.BinarySearch;

// https://www.geeksforgeeks.org/find-if-the-given-number-is-present-in-the-infinite-sequence-or-not/

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(ans(arr,target));

    }

    static int ans(int [] arr,int target){
        // first finding the range

        //first start with box of 2
        int start = 0;
        int end = 1;

        //condition for the target in the range

        while(target > arr[end]){
            int newS = end + 1;
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newS;
        }

        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr,int target,int start,int end){

        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
