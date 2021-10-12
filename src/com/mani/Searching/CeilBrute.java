package com.mani.Searching;

// Ceiling of a number

public class CeilBrute {

    public static void main(String[] args) {
        int[] arr ={2,3,4,9,14,16,18};
        int target = 15;

        int ans = bruteForce(arr,target);
        System.out.println(ans);
    }

    static int bruteForce(int[] arr, int target) {

        int ind = -1;
        for (int i = 0; i < arr.length ; i++) {
            if(target <=  arr[i]){
                ind = i;
                break;
            }
        }

        return ind == -1 ? -1:arr [ind];
    }
}
