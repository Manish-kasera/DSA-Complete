package com.mani.MathsAssignment;

// https://leetcode.com/problems/three-divisors/
class ThreeDiv {
    public static void main(String[] args) {
        System.out.println(isThree(14));
    }
    public static boolean isThree(int n) {
        if(n <= 3){
            return false;
        }

        int count = 2;
        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0){
                count++;
            }
        }

        return count == 3;
    }
}