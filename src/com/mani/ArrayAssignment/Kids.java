package com.mani.ArrayAssignment;

import java.util.ArrayList;
import java.util.List;

class Kids {
    public static void main(String[] args) {

        int[] candies = {12,1,12};
        int k = 10;
        List<Boolean> arr = new ArrayList<>();
        arr = kidsWithCandies(candies,k);
        System.out.println(arr);
    }
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < candies.length ; i++) {
            int flag = 0;
            for (int j = 0; j < candies.length ; j++) {
               if(candies[i] + extraCandies < candies[j]){
                   ans.add(false);
                   flag = 1;
                   break;
               }
            }
            if(flag != 1){
                ans.add(true);
            }
        }
        return ans;
    }
}