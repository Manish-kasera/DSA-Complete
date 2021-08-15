package com.mani.Function_Assignment;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 88;

        boolean ans = IsEven(a);
        System.out.println(ans);

         String ans1 = evenOdd(a);
        System.out.println(ans1);

    }

    private static boolean IsEven(int a) {
        return a % 2 == 0;
    }

    static String evenOdd(int a) {
        if(a % 2 == 0)
            return "Even";
        return "Odd";
    }
}
