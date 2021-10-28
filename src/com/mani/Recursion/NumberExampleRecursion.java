package com.mani.Recursion;

public class NumberExampleRecursion {

    public static void main(String[] args) {
       print(1);
    }

    static void print(int num){

        // Base Condition
        if(num == 5){
            System.out.print(num);
            return;
        }

        System.out.print(num + " ");

        // Recursion calls

        // this is called tail recursion
        // this is the last function call
        print(num += 1);
    }
}
