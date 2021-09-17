package com.mani.RecursionAssignment;
// https://leetcode.com/problems/power-of-four/
class PowerOf4 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }

    public static boolean isPowerOfFour(int n) {

        if( n== 0){
            return false;
        }
        if(n == 1){
            return true;
        }

        if(n % 4 == 0){
            return isPowerOfFour(n/4);
        }else{
            return false;
        }
    }
}