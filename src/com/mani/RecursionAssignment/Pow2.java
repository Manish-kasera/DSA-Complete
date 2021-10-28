package com.mani.RecursionAssignment;

class Pow2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10));
    }

    static boolean isPowerOfTwo(int num) {

        if(num == 0){
            return false;
        }

        if(num == 1){
            return true;
        }
        if(num % 2 == 0){
         return isPowerOfTwo(num /= 2);
        }else{
            return false;
        }
    }
};