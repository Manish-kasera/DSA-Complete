package com.mani.ArrayAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ArrayForm {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;

        List<Integer> ans = new ArrayList<>();
        ans = addToArrayForm(num,k);
        System.out.println(ans);

    }
    public static List<Integer>  addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0 ; i--) {
            arr.add((num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k>0){
            arr.add(k % 10);
            k = k /10;
        }
        Collections.reverse(arr);
        return arr;
    }
}