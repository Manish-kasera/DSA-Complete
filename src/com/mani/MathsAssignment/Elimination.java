package com.mani.MathsAssignment;

import java.util.ArrayList;

// https://leetcode.com/problems/elimination-game/
class Elimination {

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }

    public static int lastRemaining(int n) {
       if( n == 1){
           return 1;
       }
      return 2 * (n / 2 - lastRemaining(n / 2) + 1) ;
    }


}