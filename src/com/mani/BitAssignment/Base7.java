package com.mani.BitAssignment;

// https://leetcode.com/problems/base-7/
class Base7 {

    public static void main(String[] args) {
        System.out.println(convertToBase7(-9));
    }

    public static String  convertToBase7(int num) {

        boolean isNegative = false;
        if(num < 0){
            num *= (-1);
            isNegative = true;
        }
       StringBuilder build = new StringBuilder();
        int number = 0,base=7;
        while(num != 0){
            number = num % base;
            build.append(number);
            num /= base;
        }

        if(isNegative){
            build.append("-");
        }
        build.reverse();
//        System.out.println(build);

        return String.valueOf(build);

    }
}