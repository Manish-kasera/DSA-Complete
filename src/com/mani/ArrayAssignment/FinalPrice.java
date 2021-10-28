package com.mani.ArrayAssignment;

import java.util.Arrays;

class FinalPrice {

    public static void main(String[] args) {
      int[] arr ={10,1,1,6};
        System.out.println(Arrays.toString(finalPrices(arr)));
    }

    public static int[] finalPrices(int[] prices) {
        // 8,4,6,2,3

        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length ; j++) {
                if(prices[i] >= prices[j]){
                    ans[i] = prices[i] - prices[j];
                    break;
                }else{
                    ans[i] = prices[i];
                }
            }
        }
        // for last element
        ans[prices.length-1] = prices[prices.length-1];
        return ans;
    }
}