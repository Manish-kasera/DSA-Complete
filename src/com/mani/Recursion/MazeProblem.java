package com.mani.Recursion;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        int row = 3,col = 3;
//        System.out.println(countPossibility(row,col));

        String s="";
//        printPossibility(row,col,s);

        System.out.println(pathRet(3,3,""));
    }

    private static void printPossibility(int row, int col, String p) {
        if(row == 1 && col == 1){
            System.out.println(p);
            p = "";
            return;
        }

        if(row > 1) {
            printPossibility(row - 1, col, p + "D");
        }
        if(col > 1) {
            printPossibility(row, col - 1, p + "R");
        }
    }

    private static ArrayList<String> pathRet(int row, int col, String p) {
        if(row == 1 && col == 1){
           ArrayList <String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(pathRet(row - 1, col, p + "D"));
        }
        if(col > 1) {
            list.addAll(pathRet(row, col - 1, p + "R"));
        }
        return list;
    }

    public static int countPossibility(int row, int col) {
        if(row == 1 || col == 1){
            return 1;
        }
         int left = countPossibility(row-1,col);
         int right = countPossibility(row,col-1);

         return left+right;
    }
}
