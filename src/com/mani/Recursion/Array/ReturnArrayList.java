package com.mani.Recursion.Array;

import java.util.ArrayList;

public class ReturnArrayList {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,5,3};

        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(returnArrayList(arr,5 ,0,ans));
    }

    static ArrayList<Integer> returnArrayList(int[] arr, int target, int start,ArrayList<Integer> ans){

        if(start == arr.length){
            return ans;
        }
        if(target == arr[start]){
            ans.add(start);
        }
        return returnArrayList(arr,target,start+1,ans);
    }
}
