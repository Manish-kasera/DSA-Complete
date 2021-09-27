package com.mani.Bitwise;

public class ResetIthBit {
    public static void main(String[] args) {

        int num = 8,n = 2;


        // after making reset what will num become
        System.out.println(makeReset(num,n));


    }


    public static int makeReset(int num, int n) {
     /*
         1  ---> 0
         0 ----> 0
      */

        int mask = 1 << (n-1);
        int ans = num |  mask;

        return ans;
    }
}
