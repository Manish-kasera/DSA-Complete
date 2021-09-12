package com.mani.SortingAssignment;

// https://leetcode.com/problems/sort-colors/

import java.lang.reflect.Array;
import java.util.Arrays;

class SortColors {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 1, 1};
        sortColor(arr);
    }

    static void sortColor1(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {
            for (int j = i + 1; j >0 ; j--) {

                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void sortColor(int[] arr){

        int c0 = 0,c1 = 0, c2 = 0;
        for (int x:arr) {
            if(x == 0)
                c0++;
            else if(x % 2 == 0)
                c2++;
            else
                c1++;
        }

        for (int i = 0; i < c0 ; i++) {
            System.out.print("0 ");
        }
        for (int i = c0; i < c0+c1 ; i++) {
            System.out.print("1 ");
        }
        for (int i = c0+c1; i < c0+c1+c2 ; i++) {
            System.out.print("2 ");
        }
        System.out.println(Arrays.toString(arr));
    }

}