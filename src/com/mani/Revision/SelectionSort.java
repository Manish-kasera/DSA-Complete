package com.mani.Revision;

import java.util.Arrays;

import static com.mani.Revision.BubbleSort.swap;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr ={7 ,5, 24, 53, 1};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        // 7 5 24 53 1
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            int max_in = 0;
            int last =  n-i-1;
            for (int j = 0; j < n-i ; j++) {
                if(arr[max_in] < arr[j]){
                    max_in = j;
                }
            }
            swap(max_in,last,arr);
        }
    }
}
