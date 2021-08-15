package com.mani.Linear_Search;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 123, 1123, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

//        int target = 4;
//        System.out.println(searchIn2D(arr,target));

//        int target = 14;
//        int[] ans = searchIn2D2(arr,target);
//        System.out.println(Arrays.toString(ans));


        int ans = maxNumber1(arr);
        System.out.println(ans);
    }

     static int maxNumber1(int[][] arr) {
//        int max = arr[0][0];
          int max = Integer.MIN_VALUE;

//         for (int row = 0; row < arr.length ; row++) {
//             for (int col = 0; col < arr[row].length; col++) {
//
//                 if(arr[row][col] > max){
//                     max = arr [row][col];
//                 }
//             }
//         }

         for (int[] ints : arr) {
             for (int element : ints) {

                 if (element > max) {
                     max = element;
                 }
             }
         }
        return max;
    }

    static int[] searchIn2D2(int[][] arr, int target) {

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {

                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[] {-1,-1};

    }

/*
    static boolean searchIn2D(int[][] arr, int target) {

         for (int row = 0; row < arr.length ; row++) {
             for (int col = 0; col < arr[row].length ; col++) {

                 if(arr[row][col] == target){
                     return true;
                 }
             }
         }

        return false;
    }
*/
}
