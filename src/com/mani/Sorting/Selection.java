package com.mani.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {

        int[] arr = {2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1 ; i++) {

            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxInd(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxInd(int[] arr, int start, int end) {

        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
