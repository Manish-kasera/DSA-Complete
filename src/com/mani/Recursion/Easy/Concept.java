package com.mani.Recursion.Easy;

public class Concept {
    public static void main(String[] args) {
//       fun1(5);
       fun2(5);
    }
    static  void fun1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // Stackoverflow as the value can't modify after passing in the function
        fun1(n--); //post decrement


        /* n-- vs --n

        */
    }
    static  void fun2(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun2(n-1);
    }
}
