package com.mani.Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }

   static void swap(int[] arr, int i, int i1) {
     int temp = arr[i];
     arr[i] = arr[i1];
     arr[i1] = temp;
    }
}
