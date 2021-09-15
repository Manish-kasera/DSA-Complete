package com.mani.BinarySearchPractice;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/
class CheckIfDouble {

    public static void main(String[] args) {
        int[] arr = {0,0};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] % 2 == 0 ){
                for (int j = 0; j < arr.length ; j++) {
                    if(i != j) {
                        if (arr[j] * 2 == arr[i] ) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}