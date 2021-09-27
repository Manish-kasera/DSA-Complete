package com.mani.Bitwise;

public class Power2 {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPow(n));
    }

    public static boolean isPow(int n) {
        int count = 0;

        while(n != 0){
            int temp = n & 1;
           n = n >> 1;
           if(temp == 1){
               count++;
           }
        }
        return count == 1;
    }
}
