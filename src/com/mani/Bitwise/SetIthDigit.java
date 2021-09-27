package com.mani.Bitwise;

public class SetIthDigit {
    public static void main(String[] args) {

        int num = 5;
        int n = 1;

        // what actual number comes after setting
//      System.out.println(setIthBit(num,n));

        // isSet == 1 (ok), if not set return 0
        System.out.println(isSet(num,n));
    }

    private static int isSet(int num, int n) {

        int mask = 1 << n-1;
       return (n & mask);

    }

    public static int setIthBit(int num, int n) {

        int mask = 1 << (n-1);

        return num | mask;

    }
}
