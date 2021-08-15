package com.mani.Array;

public class ArrayFun {
    public static void main(String[] args) {

        int[] arr1 = {833,6,3,2,3};

        int ans = sum(arr1);
        System.out.println(ans);
    }

    static int sum(int[] arr1) {
       if(arr1.length <= 0){
           return -1;
       }
      int sum = 0;
      for(int ele : arr1)
          sum += ele;

      return sum;
    }
}
