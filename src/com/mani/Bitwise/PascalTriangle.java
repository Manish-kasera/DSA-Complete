package com.mani.Bitwise;

public class PascalTriangle {
    public static void main(String[] args) {
        /*
          1
          1 1
          1 2 1
          1 3 3 1
          1 4 6 4 1

          For nth row sum = 2^(n-1)
         */

        int n = 5;
        int sum = (int) Math.pow(2,n-1);
        System.out.println(sum);
    }
}
