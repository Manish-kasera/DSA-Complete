package com.mani.Searching;

public class MountedArray {
    public static void main(String[] args) {

      int[] arr = {1,2,3,4,5,3,1};
      int target = 3;
        System.out.println("-1");
//      int ind = mountedArray(arr,target);
//        System.out.println(ind);

    }

    static int mountedArray(int[] arr, int target) {
      int start = 0,end = arr.length -1;
      int mid,ans = -1 ;

      while(start <= end){

          mid = start + (end - start)/2;

          if(arr[mid] > target){
              end = mid;
          }else if(arr[mid] < target){
              start = mid;
          }else{
            ans = mid ;
            end = mid;
          }
      }
      return  ans;
    }
}
