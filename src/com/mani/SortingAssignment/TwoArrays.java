package com.mani.SortingAssignment;

import java.util.Arrays;

class TwoArrays {

    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};

        boolean res = canBeEqual(target,arr);
        System.out.println(res);
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return  Arrays.equals(target,arr);
    }
}