package com.mani.RecursionAssignment;

public class DigSum {
    public static void main(String[] args) {
        System.out.println(superDigits("123",3));
    }

    public static int superDigits(String n,int k){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < k ; i++) {
            builder.append(n);
        }
        int x = 0;
        while(builder.length() > 1){

            for (int i = 0; i < builder.length() ; i++) {
                 x += (builder.charAt(i) - 48);
            }
            builder.delete(0,builder.length());
            builder.append(x);
            x = 0;
        }

        return Integer.parseInt(builder.toString());
    }
}
