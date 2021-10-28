package com.mani.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,22,233,14,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {

        boolean swapped ;
        int n = arr.length;
        for (int i = 0; i < n  ; i++) {
            swapped = false;
            for (int j = 1; j <= n - i - 1 ; j++) {
                if(arr[j-1] > arr[j]){
//                    swap(arr[j-1],arr[j]);
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // if we didnt swap for particular value of i , it means array is sorted hence stop loop
            if(!swapped)  // !false = true
                break;
            }
        }


}
