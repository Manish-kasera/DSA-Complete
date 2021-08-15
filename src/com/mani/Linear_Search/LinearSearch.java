package com.mani.Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10,2,3,24,56};
        int target = 5;

//        int ans = linearSearch(arr,target);
//        System.out.println(ans);

//        int index = linearSearchIndex(arr,target);
//        System.out.println(index);

        int ele = linearSearchElement(arr,target);
        System.out.println(ele);


    }

    static int linearSearchElement(int[] arr, int target) {
        for(int element : arr){
            if(element == target ){
                return element;
            }
        }
       return -1;
    }

    static int linearSearch(int[] arr,int target) {
        for(int x: arr){
            if(x == target)
                return 1;
        }
        return -1;
    }

    static int linearSearchIndex(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}

