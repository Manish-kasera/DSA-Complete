package com.mani.RecursionAssignment;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {


        if(num == 1){
            return 1;
        }

        if( num % 2 == 0){
            return 1 + numberOfSteps(num/2);
        }else{
            return 1 + numberOfSteps(num-1);
        }

    }
}