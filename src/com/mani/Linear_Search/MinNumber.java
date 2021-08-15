package com.mani.Linear_Search;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-74,3,-114,28};

        int min = minNumber(arr);
        System.out.println(min);
    }

    // assume arr.lenth !=  0
    static int minNumber(int[] arr) {
        int min = arr[0];
        for(int ele : arr){
            if(min > ele){
                min = ele;
            }
        }
        return min;
    }
}
