package com.mani.ArrayAssignment;

class Median {
    public static void main(String[] args) {
        int[] nums1 = {2};
        int[] nums2 = {};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      // 1 3  // 2

      int i = 0,j = 0,k = 0;
      double[] arr = new double[nums1.length+nums2.length];

      while(i < nums1.length && j < nums2.length){
          if(nums1[i] < nums2[j]){
            arr[k++] = nums1[i++];
          }else{
              arr[k++] = nums2[j++];
          }
      }
      while (i < nums1.length){
          arr[k++] = nums1[i++];
      }

      while (j < nums2.length){
            arr[k++] = nums2[j++];
      }

      int mid = arr.length/2;
      if(arr.length % 2 == 1){
          return arr[mid];
      }
      return (arr[mid] + arr[mid-1])/2;
    }
}