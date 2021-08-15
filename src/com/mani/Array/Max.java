package com.mani.Array;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
        int[] arr = new int[5];

        int i = 0;
        for (int ele : arr) {
            arr[i] = in.nextInt();
            i++;
        }
*/

       int[] arr = {1,3,23,9,48};
//        System.out.println(maxi(arr));

        int start = 0, end = 2;
        int ans = maxiInRange(arr,start,end);
        System.out.println(ans);

    }

    static int maxi(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > max)
                 max = ele;
        }
        return max;
    }

    static int maxiInRange(int[] arr,int start,int end) {

        if(start > end){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
