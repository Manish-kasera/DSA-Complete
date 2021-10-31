package com.mani.Recursion;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

        bubbleRev(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr,int row,int col){

        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr,row,col+1);
        }else{
            bubble(arr,row-1,0);
        }
    }

    public static void bubbleRev(int[] arr,int row,int col){

        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] < arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleRev(arr,row,col+1);
        }else{
            bubbleRev(arr,row-1,0);
        }
    }
}
