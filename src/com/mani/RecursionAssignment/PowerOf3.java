package com.mani.RecursionAssignment;

// https://leetcode.com/problems/power-of-three/

class PowerOf3 {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(45));
    }

    public static boolean isPowerOfThree(int n) {

        if(n==0){
            return false;
        }
        if(n == 1){
            return true;
        }

        if(n % 3 == 0){
            return isPowerOfThree(n/3);
        }else{
            return false;
        }
    }
}