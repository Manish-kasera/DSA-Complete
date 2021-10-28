package com.mani.Recursion;

public class Triangle {

    public static void main(String[] args) {

//        triangle1(4);
      //  triangle11(4,0);

        triangle2(4,0);
    }


    public static void triangle2(int r,int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            triangle2(r,c+1);
            System.out.print("* ");

        }else{
            triangle2(r-1,0);
            System.out.println();
        }
    }


    public static void triangle11(int r,int c) {
      if(r == 0){
          return;
      }
      if(c < r){
          System.out.print("* ");
          triangle11(r,c+1);
      }else{
          System.out.println();
          triangle11(r-1,0);

      }
    }

    public  static void   triangle1(int n){

        int row = 4,col = 0;
        helper(row,col);

    }

    public static void helper(int row, int col) {
        if(row == col){
            System.out.println();
            row--;
            col = 0;
        }
        if(row <= 0){
            return;
        }
        System.out.print("* ");
        helper(row,col+1);
    }
}
