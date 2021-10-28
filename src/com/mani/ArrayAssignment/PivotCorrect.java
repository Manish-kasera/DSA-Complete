package com.mani.ArrayAssignment;

import java.util.Arrays;

import static com.mani.Recursion.BubbleSort.swap;

public class PivotCorrect {
    public static void main(String[] args) {

        int[] arr ={10,9,5,3,2,4};
        int pivot = 3;
        correctPos(arr,pivot);
        System.out.println(Arrays.toString(arr));
    }

    static void correctPos(int[] arr,int pivot){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            // voilation condition
            if(arr[start] >= pivot  && arr[end] <= pivot ){
                swap(arr,start,end);
                start++;
                end--;
            }

            if(arr[start] <= pivot){
                start++;
            }
            if(arr[end] >= pivot){
                end--;
            }
        }
    }
}
