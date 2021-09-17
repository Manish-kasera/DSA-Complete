package com.mani.RecursionAssignment;

// https://leetcode.com/problems/power-of-two/

class PowerOf2 {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(5));
    }
    public static boolean isPowerOfTwo(int n) {

        if(n == 0){
            return false;
        }
        if(n == 1 || n == 2){
            return true;
        }
        if(n % 2 == 0){
            return isPowerOfTwo(n/2);
        }else{
            return false;
        }
    }
}