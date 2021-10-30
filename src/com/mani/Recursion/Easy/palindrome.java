package com.mani.Recursion.Easy;

import static com.mani.Recursion.Easy.Reverse.rev2;

public class palindrome {
    public static void main(String[] args) {

        System.out.println(palin1(1));
    }

    static  boolean palin1(int num){

        return num == rev2(num);
    }
}
