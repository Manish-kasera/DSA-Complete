package com.mani.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {10,5,3,2,1,0,-8,-109};
        int target = -109;

        int index = orderAgnosticBS(arr,target);
        System.out.println(index);
    }

    static int orderAgnosticBS(int[] arr, int target) {


        int start = 0 ,end = arr.length -1;
        int mid;

        boolean isAsc;
        isAsc = arr[end] > arr[start];

      while(start<= end){
          mid = start + (end - start)/2;

          if(arr[mid]== target){
              return mid;
          }

          if(isAsc){

              if(target > arr[mid]){
                  start = mid + 1;
              }else{
                  end = mid - 1;
              }
          }else{
              if(target > arr[mid]){
                  end = mid - 1;
              }else{
                  start = mid + 1;
              }
          }

      }
    return -1;
    }
}
