package com.mani.StringsAndStringBuilder;

public class SD {
    public static void main(String[] args) {

        StringBuilder  str  = new StringBuilder();

        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a'+ i );
            str.append(ch);
        }
        System.out.println(str);
        System.out.println(str.charAt(0));

        str.deleteCharAt(0);
        System.out.println(str);

    }
}
