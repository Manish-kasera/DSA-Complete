package com.mani.Searching;

public class PeakIndex {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,8,6,4,3,1};

//        int ind = bitonicArray(arr);
//        System.out.println(ind);

       int ind = mountedArray(arr);
        System.out.println(ind);

    }

    static int mountedArray(int[] arr) {
       int start = 0, end = arr.length -1;
       int mid;

       while(start < end){

           mid = start + (end - start)/2;


           // I am in decreasing array
           if(arr[mid] > arr[mid + 1]){
               // this  may be the ans,but look for at left
               // this is why end != mid -1
               end = mid ;
           }else{
               // you are ascending part of array
               start = mid + 1; //because we know that mid+1 element > mid element
           }

           // in the end, start == end and pointing to the largest element because of the 2 checks
       }
       return end; // or start
    }

    static int bitonicArray(int[] nums) {
        int ans = -1;

        int start = 0, end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // potential answer
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return  ans;
    }
}