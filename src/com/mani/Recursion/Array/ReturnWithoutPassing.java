package com.mani.Recursion.Array;

import java.util.ArrayList;

public class ReturnWithoutPassing {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,8};
        System.out.println(returnWithoutPassing(arr,4,0));
    }

    public  static  ArrayList<Integer> returnWithoutPassing(int[] arr, int target, int index) {
        ArrayList <Integer> list = new ArrayList<>();

        if(index == arr.length){
          return list;
         }

        // this will contain the answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfromBelowCalls =  returnWithoutPassing(arr,target,index+1);

         list.addAll(ansfromBelowCalls);
         return list;
    }
}
