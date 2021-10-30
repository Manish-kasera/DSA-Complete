package com.mani.Recursion.Easy;

import java.util.ArrayList;

public class RevNum {
    public static void main(String[] args) {
        int num = 283;
//        System.out.println(rev1(num));
        StringBuilder build = new StringBuilder();
        System.out.println(rev2(num,build));
    }

    public static int rev2(int num, StringBuilder build) {

        if(num > 0 && num <= 9){
            build.append(num);
            String ans = String.valueOf(build);
            int an = Integer.parseInt(ans);
            return an;
        }
        build.append(num % 10);
        return rev2(num/10,build);
    }

    public static int rev1(int num) {
       int rev = 0;
        while(num!=0){
           int rem = num % 10;
           rev = rev * 10 + rem;
           num /= 10;
       }
        return rev;
    }
}
