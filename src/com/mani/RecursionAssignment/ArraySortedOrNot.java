package com.mani.RecursionAssignment;
// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class ArraySortedOrNot {

    public static void main(String[] args) {

        int[] arr ={10,9,5,4,1};
        System.out.println(isSorted(arr,arr.length));
    }

    public static boolean isSorted(int[] arr,int n){

        if(n == 1){
            return true;
        }

        if(arr[n-1] < arr[n-2])
            return false;

        return isSorted(arr,n-1);
    }
}
