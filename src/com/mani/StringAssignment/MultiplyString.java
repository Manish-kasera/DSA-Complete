package com.mani.StringAssignment;

class MultiplyString {
    public static void main(String[] args) {
        String s = multiply("123","456");
        System.out.println(s);
    }

    public static String multiply(String num1, String num2) {
        int x = stringToInt(num1);
        int y = stringToInt(num2);
        String s = Integer.toString(x*y);
        return s;
    }

     public static int stringToInt(String s) {

        int num = 0;
        int i = 0;
        while (i < s.length()){
            num *= 10;
            num += s.charAt(i++) - '0';
        }
        return num;
    }
}