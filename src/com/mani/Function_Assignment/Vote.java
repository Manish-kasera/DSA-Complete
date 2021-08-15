package com.mani.Function_Assignment;

public class Vote {
    public static void main(String[] args) {
        int age = 13;
        boolean ans = isEligible(age);
        System.out.println(ans);
    }

     static boolean isEligible(int age) {
        return age >= 18;
    }
}
