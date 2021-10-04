package com.mani.Recursion;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class NumOfSteps {
    public static void main(String[] args) {

        int ans = numberOfSteps(1);
        System.out.println(ans);
    }

    public static int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }

        if(num % 2 == 0){
            return 1 + numberOfSteps(num/2);
        }
        return 1 + (numberOfSteps(num-1));
    }
}