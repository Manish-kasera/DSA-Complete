package com.mani.StringAssignment;
//https://leetcode.com/problems/merge-strings-alternately/
class Merge {

    public static void main(String[] args) {
        String word1 = "abcd", word2 ="pq";
        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder build = new StringBuilder();
        int ind = Math.min(word1.length(),word2.length());

        for (int i = 0; i < ind ; i++) {
            build.append(word1.charAt(i));
            build.append(word2.charAt(i));
        }
        if(word1.length() > word2.length() ){
            for (int i = ind; i < word1.length() ; i++) {
                build.append(word1.charAt(i));
            }
        }else if(word2.length()>word1.length()){
            for (int i = ind; i < word2.length() ; i++) {
                build.append(word2.charAt(i));
            }
        }

        return String.valueOf( build);

    }
}