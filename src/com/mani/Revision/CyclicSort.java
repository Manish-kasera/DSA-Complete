package com.mani.Revision;

import java.util.Arrays;

import static com.mani.Revision.BubbleSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr ={3,5,4,1,2,0};
        System.out.println(Arrays.toString(arr));

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {

        // 3,5,4,1,2,0
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] ;

            if(arr[i] != arr[correct]){
                swap(i,correct,arr);
            }else{
                i++;
            }
        }
    }
}
