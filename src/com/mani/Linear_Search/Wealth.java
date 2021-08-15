package com.mani.Linear_Search;
//https://leetcode.com/problems/richest-customer-wealth/submissions/
public class Wealth {
    public static void main(String[] args) {
        int[][] arr ={
                {29,3000},
                {1,3,4},
                {10,3,44,2093}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {

        int maxWealth = Integer.MIN_VALUE;
        int total ;
        for (int person = 0; person < accounts.length; person++) {
            total = 0 ;
            for (int account = 0; account < accounts[person].length; account++) {
               total += accounts[person][account];
            }

            if(maxWealth < total){
                maxWealth = total;
            }
        }

        return maxWealth;
    }

}
