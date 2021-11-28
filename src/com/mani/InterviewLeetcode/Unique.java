package com.mani.InterviewLeetcode;
// https://leetcode.com/problems/first-unique-character-in-a-string/
public class Unique {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 97]++;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 97] == 1)
                return i;
        }
        return -1;
    }
}

