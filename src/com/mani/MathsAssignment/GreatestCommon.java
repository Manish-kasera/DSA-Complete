package com.mani.MathsAssignment;

// https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class GreatestCommon {
    public static void main(String[] args) {
        int[] num = {3,3};
        System.out.println(findGCD(num));
    }
    public static int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for(int n:nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        int maxDiv = 1;


        for (int i = 1; i  <= min ; i++) {
            if(min % i == 0  && max % i == 0){
                maxDiv= i;
            }
        }
        return maxDiv;
    }
}