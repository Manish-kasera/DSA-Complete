package com.mani.Recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
     int[] arr = {4,3,2,1,5,5,4};
     int col = 0;
     bubbleSort(arr,arr.length-1,col);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr,int row,int col) {
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[col+1]) {
                swap(arr, col, col+1);
            }
            bubbleSort(arr,row,col+1);
        }else{
            bubbleSort(arr,row-1,0);
        }

    }

    public static void swap(int[] arr, int x, int y) {
       int temp = arr[x];
       arr[x] = arr[y];
       arr[y] = temp;
    }
}
