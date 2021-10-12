package com.mani.SearchingAssignment;
// https://leetcode.com/problems/koko-eating-bananas/

public class Koko {

    public static void main(String[] args) {
      int[] arr ={3,6,7,11};
      int h = 8;

      System.out.println(minEatingSpeed(arr,h));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;
        for(int pile:piles){
            if(pile > end){
                end = pile;
            }
        }

        int mid = 0;
        while (start <= end){
             mid = start + (end-start)/2;
            if(isPossible(piles,mid,h)){
                end = mid - 1;
            }else {
                start = mid+1;
            }
        }
       return start;
    }

    public static boolean isPossible(int[] piles, int mid, int h) {
        int count = 0;
        for (int i = 0; i < piles.length ; i++) {
            if(piles[i] <= mid){
                count++;
            }else{
                count += ((piles[i] / mid)+1);
            }
        }

        if(count <= h){
            return true;
        }
        return false;
    }

}
