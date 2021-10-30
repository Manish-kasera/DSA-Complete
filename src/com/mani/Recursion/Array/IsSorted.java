package com.mani.Recursion.Array;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,16,18};
        System.out.println(isSorted(arr,arr.length,0));
    }

    public static boolean isSorted(int[] arr, int length, int i) {
        if(i == length - 1){
            return true;
        }

        return arr[i] <= arr[i+1] && isSorted(arr,length,i+1);
    }

}
