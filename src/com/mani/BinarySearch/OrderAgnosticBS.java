package com.mani.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {10,8,5,3,2,2,1};
        int target = 1;

       int index = orderAgnosticBS(arr,target);
        System.out.println(index);
    }

    static int orderAgnosticBS(int[] arr,int target) {

        int start = 0, end = arr.length - 1;

        //Find weather the array is sorted in ascending or descending order

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
//          int   mid = (start + end)/2;
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {

                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }else{

                if(target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }
        return -1;
    }

}
