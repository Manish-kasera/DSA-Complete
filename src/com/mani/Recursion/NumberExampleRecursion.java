package com.mani.Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes a number and
        // print first 5 numbers

        print(1);

    }

     static void print(int n){
        // Base Condition
        if(n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        // Recursive call
         // if a function is called again and again , you can
         // treat it as a separate call in the stack

       // this is called tail recursion
         // this is the last function call
        print(n + 1);
    }


}
