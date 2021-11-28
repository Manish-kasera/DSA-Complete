package com.mani.RecursionAssignment.Stocks;

import java.util.Arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stock1 {
     public static void main(String[] args) {
      int[] arr = {7,1,5,3,6,4};
         System.out.println(maxProfit3(arr));
     }
     public static int maxProfit1(int[] prices) {
         int maxPro = 0;
         for (int i = 0; i < prices.length - 1; i++) {
             for (int j = i; j < prices.length ; j++) {

                 if(prices[i] < prices[j] ){
                     if(maxPro < (prices[j]-prices[i])){
                         maxPro = prices[j]-prices[i];
                     }
                 }
             }
         }
         return maxPro;
     }

     public static int maxProfit2(int[] prices) {
        int[] maxArr = new int[prices.length];
        int max = prices[prices.length-1];
         for (int i = prices.length-1; i >=0 ; i--) {
             maxArr[i] = max;
             if(max < prices[i]){
                 max = prices[i];
                 maxArr[i] = prices[i];
             }
         }

         int ans = 0;
         for (int i = 0; i <prices.length ; i++) {
           if(maxArr[i] - prices[i] > ans){
               ans = maxArr[i]- prices[i];
           }
         }
         return ans;
     }

    public static int maxProfit3(int[] prices) {
        int minSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            }
            if(maxProfit < prices[i] - minSoFar){
                maxProfit = prices[i]-minSoFar;
            }
        }
        return maxProfit;
    }

}
