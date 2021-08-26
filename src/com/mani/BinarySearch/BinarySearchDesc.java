package com.mani.BinarySearch;

public class BinarySearchDesc {
    public static void main(String[] args) {

        int[] arr = {100,80,40,20,10,2,1,-10,-20,-30,-556};
        int target = -556;

       int index =  binarySearchDesc(arr,target);
        System.out.println(index);
    }

    static int binarySearchDesc(int[] arr, int target) {

        int start = 0,end = arr.length -1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;

            if(target > arr[mid]){
                end = mid - 1;
            }else if(arr[mid] > target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
