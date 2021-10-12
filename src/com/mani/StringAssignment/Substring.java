package com.mani.StringAssignment;

class Substring {
    public static void main(String[] args) {
        String[]  patterns = {"a","b","c"};
        String word = "abc de";
        System.out.println(numOfStrings(patterns,word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        //patterns = ["a","abc","bc","d"], word = "abc"

        int count = 0;
        for (int i = 0; i < patterns.length ; i++) {
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}