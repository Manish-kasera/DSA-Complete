package com.mani.Recursion.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};

//        System.out.println(linearSearch(arr,9,0));

//        System.out.println(search(arr,23,0));

        System.out.println(searchfromEnd(arr,1 ,arr.length-1));
    }
    static  int linearSearch(int[] arr,int target,int start){

        if(start == arr.length){
            return -1;
        }
        if(target == arr[start]){
            return start;
        }
        return linearSearch(arr,target,start+1);
    }

    static boolean search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr,target,index+1);
    }

    static boolean searchfromEnd(int[] arr,int target,int index){
        if(index == -1){
            return false;
        }

        return arr[index] == target || searchfromEnd(arr,target,index-1);
    }

}
