package com.mani.RecursionAssignment;

class ReverseString {

    public void reverseString(char[] s) {
      helper(0,s.length-1,s);
    }

    public  static void helper(int left,int right,char[]  s){

        if(left >= right) return;

        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
    }

}