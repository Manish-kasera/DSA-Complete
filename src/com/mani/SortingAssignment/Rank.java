package com.mani.SortingAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;

class Rank {

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] ans = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] rank = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i] > arr[j])
                    count++;
            }
            rank[i] = count;
        }

        return rank;
    }
}