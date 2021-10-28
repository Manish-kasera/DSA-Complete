package com.mani.Patterns;
// https://www.hackerrank.com/contests/hackerrank-internship-challenges/challenges/diagonal-difference
public class StairCase {
    
    public static void main(String[] args) {
       staircase(4);
    }

    public static void staircase(int n) {
        // Write your code here

        for(int row=1;row <= n ;row++){
            for (int col = 1; col <= n  ; col++) {
                if(col <= n - row){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
