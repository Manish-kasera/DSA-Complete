package com.mani.RecursionAssignment;
// https://leetcode.com/problems/reverse-string/

import java.util.Arrays;

class RevString {
    public static void main(String[] args) {
        char[] s ={'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int start=0,end = s.length-1;

//        char[] ans = helper1(s,start,end);
//        System.out.println(Arrays.toString(ans));

        char[] ans2 = helper(s,start,(start+end)/2,end);
        System.out.println(Arrays.toString(ans2));
    }

    public static char[] helper(char[] s, int start, int mid,int end) {
       if(start < end){
           char temp = s[start];
           s[start] = s[end];
           s[end] = temp;
           return helper(s,start+1,mid,end-1);
       }else{
           return s;
       }
    }

    public static char[] helper1(char[] s, int start, int end) {
       while(start < end){
         char temp = s[start];
         s[start] = s[end];
         s[end] = temp;
         start++;
         end--;
       }
       return s;
    }
}