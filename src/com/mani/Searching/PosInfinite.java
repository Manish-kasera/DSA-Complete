package com.mani.Searching;


//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class PosInfinite {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 100;

        System.out.println(ans(arr,target));


    }

    static int ans(int[] arr,int target){

         // first find the range
        // first start with the box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to be lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double the box value
            // endNew = previous end + 2 * sizeOfBox
            end = end + (2 * (end - start + 1));
            start = newStart;
        }
          return posElementInfinite(arr,target,start,end);
    }

    static int posElementInfinite(int[] arr, int target,int start,int end) {

        int mid;
        while(start <= end){
            mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
     }
}
