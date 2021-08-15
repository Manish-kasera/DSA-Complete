package com.mani.Function_Assignment;

import static java.lang.Integer.sum;

public class Sum {
    public static void main(String[] args) {
        int a = 72;
        int b = 712;
        int ans = sum(a,b);
        System.out.println(ans);
    }

   static int sum(int a, int b) {
        return a + b;
    }
}
