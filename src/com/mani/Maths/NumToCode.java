package com.mani.Maths;

import java.util.Scanner;

public class NumToCode {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        answer(n);
    }

    private static void answer(int n) {
         char ch;
         StringBuilder build = new StringBuilder();
        while(n != 0){
           int last = n % 10;
           ch = (char) (97 + last);
           build.append(ch);
            n /= 10;
        }

        build.reverse();
        System.out.println(build);

    }
}
