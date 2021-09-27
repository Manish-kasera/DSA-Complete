package com.mani.MathsAssignment;

// https://leetcode.com/problems/reverse-integer/
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int num) {

            long rev = 0;
            while (num != 0) {
                int temp = num % 10;
                rev = 10 * rev + temp;
                num /= 10;
            }

          if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
              return 0;
          }
          return (int) rev;
    }
}
