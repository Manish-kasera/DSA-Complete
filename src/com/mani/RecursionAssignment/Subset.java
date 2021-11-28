package com.mani.RecursionAssignment;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    static List <Integer> set = new ArrayList<>();
     static List<List<Integer>> powerSet = new ArrayList<>();


    public static List<List<Integer>> subsets(int[] arr) {

        helper(arr,0);
       return powerSet;
    }

    public static void helper(int[] arr, int start) {

      powerSet.add(new ArrayList<>(set));

        for (int i = start; i < arr.length ; i++) {
            set.add(arr[i]);
            helper(arr,i+1);
            set.remove(set.size()-1);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

}
