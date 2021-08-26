package com.mani.BinarySearch;

public class Floor {
    public static void main(String[] args) {

        int[] arr= {2,3,5,9,11,14,1623,1803};
        int target = -2;

        int floor = floorElement(arr,target);
        System.out.println(floor);
    }

    static int floorElement(int[] arr, int target) {

        int start = 0,end = arr.length - 1;
        int mid;

        // if our target is already smaller then samller element
        if( arr[0] >= target){
            return -1;
        }

        while (start <= end){
            mid = start + (end - start)/2;

            if(target == arr[mid])
                return arr[mid];
            else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        int floor = arr[end];
        return floor;
    }
}
