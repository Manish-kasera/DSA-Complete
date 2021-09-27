package com.mani.MathsAssignment;
// https://leetcode.com/problems/ugly-number/
class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(-2147483648));
    }

    public static boolean isUgly(int n) {

        if(n <= 0){
            return false;
        }
        while(n > 1){
            if(n % 2 == 0){
                n = n/2;
            }
            else if(n % 3 == 0){
                n = n/3;
            }
            else if(n % 5 == 0){
                n = n/5;
            }else{
                return false;
            }
        }
        return true;
    }
}