package com.mani.Recursion;

import java.util.ArrayList;

public class MazeLeftRightDia {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));

        System.out.println(path(3,3,""));

    }

    public static int countPath(int row,int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = countPath(row-1,col);
        int dia = countPath(row-1,col-1);
        int right = countPath(row,col-1);

        return left+right+dia;
    }
    private static ArrayList<String> path(int row, int col, String p) {
        if(row == 1 && col == 1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1) {
            list.addAll(path(row - 1, col-1, p + "D"));
        }
        if(row > 1) {
            list.addAll(path(row - 1, col, p + "V"));
        }
        if(col > 1) {
            list.addAll(path(row, col - 1, p + "H"));
        }
        return list;
    }
}
