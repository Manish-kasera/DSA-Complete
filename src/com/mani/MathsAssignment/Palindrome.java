package com.mani.MathsAssignment;
// https://leetcode.com/problems/palindrome-number/

class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-131));
    }
    public static boolean isPalindrome(int num) {

        int rev = 0;
        int org = num;
        while (num != 0) {
            int temp = num % 10;
            rev = 10 * rev + temp;
            num /= 10;
        }
      if(org *(-1) > 0)
          return false;
      return rev == org;
    }
}