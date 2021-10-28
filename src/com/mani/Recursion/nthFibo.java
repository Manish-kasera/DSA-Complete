package com.mani.Recursion;

public class nthFibo {
    public static void main(String[] args) {

        System.out.println(nthfibo(4));
    }

    static int nthfibo(int n){

        // 0 1 1 2 3 5 8 13 21 34

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return nthfibo(n-1)+ nthfibo(n-2);
    }
}
