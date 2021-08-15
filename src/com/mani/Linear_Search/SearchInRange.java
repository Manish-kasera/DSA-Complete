package com.mani.Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {18,12,-7,3,14,28};
        //Q. Search for 3 in the range of [1,4]
        int target = 18;
        int start = 1,end = 4;
        int ans = search(arr,target,start,end);
        System.out.println(ans);

    }

     static int search(int[] arr,int target,int start,int end) {

         for (int i = start; i <= end; i++) {
             if(arr[i] == target){
                 return i;
             }
         }
        return -1;
    }
}
