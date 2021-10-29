package com.mani.RecursionAssignment;

import java.util.Scanner;
// https://www.codechef.com/problems/FIBXOR01/
public class SpecialFibo {
    public static void main(String[] args) {

        int a=86,b=77,n=15;
        System.out.println(specialFibo(a,b,n));

    }
    public static int specialFibo(int a,int b,int n){
        if(n == 0){
            return a;
        }
        if(n == 1){
            return b;
        }
        return specialFibo(a,b,n-1)^ specialFibo(a,b,n-2);
    }
}
