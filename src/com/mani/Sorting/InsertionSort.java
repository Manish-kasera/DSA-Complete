package com.mani.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5,3, 4,1,2};
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {
            for (int j = i + 1; j >0 ; j--) {

                if(arr[j-1] > arr[j]){
                 swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
