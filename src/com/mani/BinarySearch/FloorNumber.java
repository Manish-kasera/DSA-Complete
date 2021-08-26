package com.mani.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,4,9,14,16,18};
        int target = -194 ;

        int ceil = floorNumber(arr,target);
        System.out.println(ceil);
    }

    // returning  greatest number <= target
    static int floorNumber(int[] arr, int target) {

        //but what if the target is smaller than the smallest number in the array
        if(target < arr[0]){
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

        return arr[end];
    }
}
