package com.mani.Revision;

import java.util.Arrays;

import static com.mani.Revision.BubbleSort.swap;

public class InsertionSort {
    public static void main(String[] args) {

        int [] arr ={5,3,4,1,2};
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
     // 5 3 4  1 2

        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1] > arr[j]){
                    swap(j-1,j,arr);
                }else{
                    break;
                }
            }
        }
    }
}
