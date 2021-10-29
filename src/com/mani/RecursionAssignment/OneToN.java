package com.mani.RecursionAssignment;

// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/
public class OneToN {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    public static void print(int n) {
       if(n==1){
           System.out.print(1+" ");
           return;
       }
        print(n-1);
        System.out.print(n + " ");
    }
}
