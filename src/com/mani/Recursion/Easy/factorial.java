package com.mani.Recursion.Easy;

public class factorial {

    public static void main(String[] args) {

        System.out.println(factorial(6));
        System.out.println(sum(6));
    }

    static  int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }

        return num * factorial(num-1);
    }


    static  int sum(int num){
        if(num == 1 ){
            return 1;
        }

        return num + sum(num-1);
    }
}
