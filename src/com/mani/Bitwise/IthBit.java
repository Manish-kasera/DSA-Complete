package com.mani.Bitwise;

public class IthBit {
    public static void main(String[] args) {
        int num = 37;
        int n = 4;
        System.out.println(ithBit(num,n));
    }

    public static int ithBit(int num,int n) {

         int mask = 1 << (n-1);

         int ans = num & mask ;
         ans = ans >> (n-1);
         return ans;


    }
}
