package com.mani.RecursionAssignment;
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 0, 93, 774, 64};
        System.out.println(max(arr,0,arr.length-1,arr[0]));
        System.out.println(min(arr,0,arr.length-1,arr[0]));
    }

    public static int max(int[] arr,int start,int end,int ele){


        if(start <= end){
            if(ele < arr[start]){
                ele = arr[start];
            }
            return max(arr,start+1,end,ele);
        }else{
            return ele;
        }
    }


    public static int min(int[] arr,int start,int end,int ele){


        if(start <= end){
            if(ele > arr[start]){
                ele = arr[start];
            }
            return min(arr,start+1,end,ele);
        }else{
            return ele;
        }
    }
}

