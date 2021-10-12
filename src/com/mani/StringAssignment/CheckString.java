package com.mani.StringAssignment;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
class CheckString {

    public static void main(String[] args) {
      String[] words1 = {"a","bc","ef"};
      String[] words2 = {"abcdef"};

        System.out.println(arrayStringsAreEqual(words1,words2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder builder1 = new StringBuilder();
      StringBuilder builder2 = new StringBuilder();

        for (String value : word1) {
            builder1.append(value);
        }
        for (String s : word2) {
            builder2.append(s);
        }

        if(builder1.length() != builder2.length()){
            return false;
        }else{
            for (int i = 0; i < builder1.length() ; i++) {
                if(builder1.charAt(i) != builder2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}