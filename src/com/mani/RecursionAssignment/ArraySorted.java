package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,10,44};
        System.out.println(sorted(arr,0));

    }

    public static boolean sorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }

        return arr[index] <= arr[index+1]  && sorted(arr,index+1);
    }
}
