package com.mani.Recursion.Strings;

public class SubsequenceWithAscci {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        seqWithAscii(p,up);
    }

    public static void seqWithAscii(String p, String up) {
       if(up.isEmpty()){
           System.out.println(p);
           return;
       }
       char ch = up.charAt(0);

       seqWithAscii(ch+p,up.substring(1));
       seqWithAscii(p,up.substring(1));
       seqWithAscii(p+(ch+0),up.substring(1));
    }
}
