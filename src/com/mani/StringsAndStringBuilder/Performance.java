package com.mani.StringsAndStringBuilder;

public class Performance {
    public static void main(String[] args) {

        String series = "";
        for (int i = 0; i < 26 ; i++) {
           char ch = (char)('a'+ i );
//            System.out.println(ch);
            series += ch;
            // It creating new objects every Time
            // So We Can Use StringBuilder
        }
        System.out.println(series);
    }
}
