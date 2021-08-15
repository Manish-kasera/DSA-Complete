package com.mani.Array;



public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,32},
                {34,23,44},
                {1,23},
                {24,23,2,121,1}
        };

        print(arr);


    }

    static void print2(int[][] arr) {

        for(int[] row : arr){
            for(int col : row){
                System.out.println(col + " ");
            }
            System.out.println();
        }


    }

   static void print(int[][] arr) {
       for (int row = 0; row < arr.length; row++) {
           for (int col= 0; col < arr[row].length ; col++) {
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }

    }
}
