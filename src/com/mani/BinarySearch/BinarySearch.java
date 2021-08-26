package com.mani.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 13, 55, 67, 89, 98, 99};
        int target =  938;

        int index = binarySearch(arr,target);
        System.out.println(index);
    }

   static int binarySearch(int[] arr,int target) {
        int index;
        int start = 0,end = arr.length - 1,mid;
        while(start <= end){
//             mid = (start + end)/2;
             mid = start + (end-start)/2;

             if(arr[mid] == target)
                 return mid;
             else if(arr[mid] < target)
                 start = mid + 1;
             else
                 end = mid - 1;
        }
        return -1;
    }
}
