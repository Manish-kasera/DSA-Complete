package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 21, 3, 4, 241, 3};

        System.out.println(min(arr,arr.length));
        System.out.println(max(arr,arr.length));
    }
    private static int  max(int[] arr,int n) {

        if(n == 1)
            return arr[0];

        return Math.max(arr[n-1],max(arr,n-1));
    }

    private static int min(int[] arr,int n) {
        if(n == 1)
            return arr[0];

        return Math.min(arr[n-1],min(arr,n-1));
    }
}
