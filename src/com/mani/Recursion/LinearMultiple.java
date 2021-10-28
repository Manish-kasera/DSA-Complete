package com.mani.Recursion;

import java.util.ArrayList;

public class LinearMultiple {

    public static void main(String[] args) {
        int[]  arr = {1,23,4,5,4};
        ArrayList <Integer> list = new ArrayList();

        // return arrayList using list in passing the argument
        System.out.println(findAllIndex(arr,4,0,list));


        // return arrayList Without using list in passing the argument
        System.out.println(findAllIndex2(arr,4,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int start,ArrayList<Integer> ans){

        if(start == arr.length){
            return ans;
        }

        if(arr[start] == target){
            ans.add(start);
        }

        return findAllIndex(arr,target,start+1,ans);
    }

    // Ye Sbse Important hai concept ke anusaar
    // Return ArrayList without passing in the argument.
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int start){

        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[start] == target){
            list.add(start);
        }

        ArrayList <Integer> andFromBelowCalls =  findAllIndex2(arr,target,start+1);
        list.addAll(andFromBelowCalls);

        return list;
    }
}
