package com.mani.Recursion.Easy;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr,int row, int col, int max_i) {
     if(row == 0){
         return;
     }
     if(col <= row){
         if(arr[max_i] < arr[col]){
             max_i = col;
         }
         selection(arr,row,col+1,max_i);
     }else{
         swap(arr,max_i,col-1);
         selection(arr,row-1,0,0);
     }

    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
