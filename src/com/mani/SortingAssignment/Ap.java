package com.mani.SortingAssignment;

import java.util.Arrays;

class Ap {

    public static void main(String[] args) {

        int[] arr = {3,5,1,7,9};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int diff = arr[1]-arr[0];

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if((arr[i]-arr[i-1])== diff){
                count++;
            }
        }

       return  arr.length == count;
    }
}