package com.mani.BitAssignment;

// https://leetcode.com/problems/binary-number-with-alternating-bits/
class AlternateBits {

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(2));
    }

    public static boolean hasAlternatingBits(int n) {

        if(n == 2){
            return true;
        }
        int count = n & 1;
         n = n >> 1;

        while(n != 0){

            int temp = n & 1;
            if(temp != count){
                if(count == 0){
                    count = 1;
                }else{
                    count = 0;
                }
            }else{
                return false;
            }
            n = n >> 1;
        }
        return true;
    }
}