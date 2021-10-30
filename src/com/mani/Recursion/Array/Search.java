package com.mani.Recursion.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {
      int[] arr ={1,3,5,6,7,4,5};
      findAllIndex(arr,5,0);
        System.out.println(ans);
    }

    static ArrayList <Integer> ans = new ArrayList<>();
    static  void findAllIndex(int[] arr,int target,int start){

        if(start == arr.length){
            return ;
        }
        if(target == arr[start]){
            ans.add(start);
        }
         findAllIndex(arr,target,start+1);
    }
}
