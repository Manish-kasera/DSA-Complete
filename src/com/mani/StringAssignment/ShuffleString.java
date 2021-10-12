package com.mani.StringAssignment;

// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {

    public static void main(String[] args) {
        String s = "art";
        int[] indices = {1,2,0};
        String a = restoreString(s,indices);
        System.out.println(a);
    }
    public static String restoreString(String s, int[] indices) {

        char[] charArr = new char[indices.length];
        for(int i=0; i< indices.length; i++){
            charArr[indices[i]] = s.charAt(i);
        }
        return new String(charArr);

    }

}
