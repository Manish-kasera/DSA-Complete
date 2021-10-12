package com.mani.StringAssignment;

// https://leetcode.com/problems/reverse-prefix-of-word/
class RevPrefix {
    public static void main(String[] args) {
        String word ="abcd";
        char ch = 'z';
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {

        StringBuilder build = new StringBuilder();
        int index = word.indexOf(ch,0);

        for (int i = index; i >= 0 ; i--) {
            build.append(word.charAt(i));
        }
        for (int i = index+1; i < word.length() ; i++) {
            build.append(word.charAt(i));
        }
        return String.valueOf(build);

    }
}