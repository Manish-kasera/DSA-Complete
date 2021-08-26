package com.mani.BinarySearch;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class BinarySearchAsc {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,7,19,33};
        int target = 19;

        int index = binarySearch(arr,target);
        System.out.println(index);;



    }

    static int binarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        int mid;
        while(start <= end){

              mid = start + (end -start)/2;

              if(arr[mid] > target){
                  end = mid - 1;
              }else if(target > arr[mid]){
                  start = mid +1;
              }else{
                  return mid;
              }
        }


        return -1;
    }
}
