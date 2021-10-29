package com.mani.RecursionAssignment;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        triangle(arr);
    }

    public static void triangle(int[] arr) {

        int start =0 ,end = arr.length-1;

        helper(arr,start,end);
          
    }

    public static void helper(int[] arr, int start, int end) {

        for (int i = 0; i <= end -1 ; i++) {
            arr[i] += arr[i+1];
        }

        for (int i = 0; i <= end -1 ; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();

        if(end == 1){
            return;
        }
        helper(arr,start,end-1);


    }
}
