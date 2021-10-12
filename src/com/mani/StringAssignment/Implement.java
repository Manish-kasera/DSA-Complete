package com.mani.StringAssignment;

class Implement {
    public static void main(String[] args) {

        System.out.println(strStr("",""));
    }
    public static int strStr(String haystack, String needle) {
        StringBuilder build = new StringBuilder();
        build =  new StringBuilder(haystack);

        int ind = build.indexOf(needle);

        return ind;
    }
}