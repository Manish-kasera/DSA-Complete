package com.mani.Recursion.Easy;

public class BS {
    public static void main(String[] args) {
        int[] arr ={10,20,40,50,60,70};
        System.out.println(search(arr,1000,0,arr.length-1));
    }

    static  int search(int[] arr,int target,int start,int end){
        int mid = start + (end-start)/2;

        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }else if(target > arr[mid]){
            return  search(arr,target,mid+1,end);
        }else{
            return search(arr,target,start,mid-1);
        }
    }
}
