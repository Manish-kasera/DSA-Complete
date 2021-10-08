package com.mani.Revision;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,15,100,20};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public  static void bubbleSort(int[] arr){

        // 3 5 4 1 2
        int n = arr.length;
        // i is basically number of passes
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                // comparing each consecutive element
                if(arr[j] > arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
