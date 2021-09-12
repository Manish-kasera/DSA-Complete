package com.mani.BinarySearch;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {

        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = firstLast(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstLast(int[] arr, int target) {

        int[] ans = {-1,-1};

        // check for the first occurence of target
         ans[0] = search(arr,target,true);

         if(ans[0]!=-1) {
             ans[1] = search(arr, target, false);
         }


        return ans;

    }

    // this function just returns the index value target
    static int search(int[] arr,int target,boolean findStartIndex){

        int ans = -1;
        int start = 0,end = arr.length - 1;
        int mid ;

        while(start <= end){
            mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid -1;
            }else{
                // potential answer ans found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }
        }
        return  ans;
    }
}
