package com.mani.StringsAndStringBuilder;

import java.util.Locale;

public class Palin {
    public static void main(String[] args) {

        String s = "AAaa";
        System.out.println(palindrom(s));
    }

    static boolean palindrom(String s){

        s = s.toLowerCase();
        if(s == null || s.length()==0 ){
            return true;
        }

        for (int i = 0; i <= s.length()/2 ; i++) {

            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;

    }
}
