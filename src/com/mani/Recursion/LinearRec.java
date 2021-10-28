package com.mani.Recursion;

public class LinearRec {
    public static void main(String[] args) {
       int[] arr = {1,334,3,10};
//        System.out.println(linearRec(arr,10,0));
//
//        System.out.println(searchBack(arr,0,arr.length-1));

        System.out.println(search(arr,334,0,-1));
    }

    static boolean linearRec(int[] arr,int target,int start){

        // array out of bound means array doesn't present
        if(start == arr.length ){
            return false;
        }

        return (arr[start] == target) || linearRec(arr,target,start + 1);
    }
    static  boolean searchBack(int[] arr,int target,int end){

        if(end < 0){
            return false;
        }

        return arr[end] == target || searchBack(arr,target,end-1);
    }

    static int search(int[] arr,int target,int start,int index){
      if(start == arr.length - 1){
          return index;
      }
      if(arr[start] == target){
          index = start;
      }
      return search(arr,target,start+1,index);
    }

}

