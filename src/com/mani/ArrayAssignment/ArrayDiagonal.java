package com.mani.ArrayAssignment;

// https://www.hackerrank.com/contests/hackerrank-internship-challenges/challenges/diagonal-difference
import java.util.ArrayList;
import java.util.List;

public class ArrayDiagonal {
    public static void main(String[] args) {
        List <List<Integer>> list = new ArrayList<List<Integer>>();

    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int sum1 = 0,sum2 = 0;
        for (int row = 0; row < arr.size() ; row++) {
            for (int col = 0; col < arr.size() ; col++) {
              if(row == col){
                  sum1 += arr.get(row).get(col);
              }

              if(row+col == arr.size()-1){
                  sum2 += arr.get(row).get(col);
              }
            }
        }
       if(sum1 > sum2){
           return sum1-sum2;
        }
       return sum2-sum1;
    }
}
