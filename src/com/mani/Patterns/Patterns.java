package com.mani.Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();

//        pattern1(row,col);

//        pattern2(row,col);

//        pattern3(row,col);

//          pattern4(row,col);

//          pattern5(row,col);

//        pattern6(row,col);

    }



    static void pattern6(int row, int col) {
         for (int i = 0; i < row ; i++) {
             for (int j = 0; j < col-i-1 ; j++) {
                 System.out.print("  ");
             }
             for (int j = col - i -1; j <row ; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }

    static void pattern5(int row, int col) {

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < row - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    static void pattern4(int row, int col) {

         for (int i = 0; i < row ; i++) {
             int count = 1;
             for (int j = 0; j < i + 1 ; j++) {
                 System.out.print(count + " ");
                 count++;
             }
             System.out.println();
         }
    }

    static void pattern3(int row, int col) {

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < row - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern2(int row, int col) {

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int row,int col) {

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
