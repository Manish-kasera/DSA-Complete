package com.mani.Array;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //row must be initize not col
        int[][] arr = new int[3][];

        //arr.length // it gives length of arr always

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int[] row : arr){
            for(int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
