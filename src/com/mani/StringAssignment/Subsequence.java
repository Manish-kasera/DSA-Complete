package com.mani.StringAssignment;

// https://leetcode.com/problems/is-subsequence/
class Subsequence {
    public static void main(String[] args) {
        String t= "bcd";
        System.out.println(isSubsequence("bcd",t));
    }

    public static boolean isSubsequence(String s, String t) {
        // abc(t) acb(f) (ajdbdfc)

        int i = 0,j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }

        }
        return i == s.length();
    }
}