package com.mani.Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--); // pass then sub (X)
        fun(--n); // sub then pass

        // n-- vs --n
    }
}
