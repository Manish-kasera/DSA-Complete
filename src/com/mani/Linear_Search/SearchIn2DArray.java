package com.mani.Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 123, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
/*
       int target = 24;
        System.out.println(search(arr,target));
*/

//        int target = 12 ;
//        int[] ans = search2(arr,target); // format of return value {row,col}
//        System.out.println(Arrays.toString(ans));

        int ans = maxNumber(arr);
        System.out.println(ans);
    }

    static int maxNumber(int[][] arr) {

//        int maxi = arr[0][0];
        int maxi = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                if(arr[row][col] > maxi){
//                    maxi = arr[row][col];
//                }
//            }
//        }


        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > maxi) {
                    maxi = element;
                }
            }
        }
        return maxi;
    }

    static int[] search2(int[][] arr, int target) {

//        int[] ans = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(target == arr[row][col]){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

/*
    static int search(int[][] arr, int target) {

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(target == arr[row][col]){
                    return 1;
                }
            }
        }

        return -1;
    }
*/


}
