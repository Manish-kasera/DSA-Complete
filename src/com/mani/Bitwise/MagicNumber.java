package com.mani.Bitwise;

// Amazon Questions
public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(magicNumber(n));
    }

    public static int magicNumber(int n) {

        int ans = 0;
        int count = 0;
        int base = 5;
         while(n != 0){
             int last = n & 1;
             count++;
             ans += ((int) Math.pow(base,count) * last);
             n = n >> 1;
         }
        System.out.println(count);
         return ans;
    }
}
