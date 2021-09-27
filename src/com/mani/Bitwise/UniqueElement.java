package com.mani.Bitwise;

public class UniqueElement {

    public static void main(String[] args) {
        int[] arr = {3,1,2,2,3,1,7};
        System.out.println(xor(arr));

    }

    public static int xor(int[] arr) {

        int unique = 0;
         for(int i : arr)
             unique ^= i;
     return unique;
    }
}
