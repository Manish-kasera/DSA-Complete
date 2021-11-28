package com.mani.Array;

import java.util.Arrays;

import static com.mani.Array.Swap.swap;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = {1,3,23,48,4};

//        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        reverse1(arr);
        System.out.println(Arrays.toString(arr));

    }

   static void reverse1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // two pointer method
        while(start < end){
            swap(arr,start,end); //swap method from swap class
            start++;
            end--;
        }
    }

    static void reverse(int[] arr){

        for (int start = 0; start < arr.length/2; start++) {
            int temp = arr[start];
            arr[start] = arr[arr.length - start-1] ;
            arr[arr.length - start-1 ] = temp;
        }
    }
}
