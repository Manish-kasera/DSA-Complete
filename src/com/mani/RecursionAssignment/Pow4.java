package com.mani.RecursionAssignment;

class Pow4 {
    public static void main(String[] args) {

        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(32));
    }
    public static boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        if(n == 0 || n== 2|| n == 3){
            return false;
        }
        if(n % 4 == 0){
            return isPowerOfFour(n /= 4);
        }else{
            return false;
        }
    }
}