package com.mani.ArrayAssignment;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LuckyNumber {

    public static void main(String[] args) {
        int[][] matrix = {
                {7,8},
                {1,2},

        };
        List <Integer> ans = new ArrayList<>();
        ans = luckyNumbers(matrix);
        System.out.println(ans);
    }

    public  static List<Integer> luckyNumbers (int[][] matrix) {

        List <Integer> ans1 = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int min = Integer.MAX_VALUE;
            for (int col = 0; col < matrix[row].length ; col++) {

                if(matrix[row][col] < min){
                    min = matrix[row][col];
                }
            }
          ans1.add(min);
        }


        
        List<Integer> ans2 = new ArrayList<>();


        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < matrix.length  ; row++) {

                if(matrix[row][col] > max){
                    max = matrix[row][col];
                }

            }
            ans2.add(max);
        }


        List <Integer> finalAns = new ArrayList<>();

        for(int i : ans1){
            for(int j: ans2){
                if(i == j){
                    finalAns.add(i);
                }
            }
        }
        return finalAns;
    }
}