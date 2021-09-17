package com.mani.Patterns;

public class Patterns {
    public static void main(String[] args) {

//       pattern1(5);
//       pattern2(4);
//
//       pattern3(5);
//       pattern4(5);
//
//       pattern5(5); // thoda time laga
//
//       pattern28( 5);// important
//         pattern30(5);

//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);


//        pattern10(5);
//        pattern11(5);

//        pattern12(5);

//        pattern21(5);
//        pattern22(5);

//          pattern26(6);
//            pattern23(3);
//            pattern25(5);

        pattern13(5);

    }

    static void pattern13(int n){

        for (int row = 1; row <= n; row++) {


        }


    }

    static  void pattern25(int n){

        for (int row = 1; row <=n ; row++) {

            int totalSpaces = n - row;
            for (int space = 1; space <= totalSpaces ; space++) {
                System.out.print(" ");
            }

            if(row == 1 || row == n){
                System.out.print("* * * * *");
            }else{
                System.out.print("*       *");
            }

        }

    }

    static void pattern23(int n){

        for (int row = 1; row <= n ; row++) {

            for (int col = 1; col <= 3 * n ; col++) {
                if((row + col) % 4 == 0){
                    System.out.print("* ");
                }else if(row == 2 && ((row +col) % 2==0)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static  void pattern26(int n){

        for (int row = 1; row <= n ; row++) {

            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }


    static  void pattern22(int n){

        for (int row = 1; row <= n ; row++) {

            for (int col = 1; col <= row ; col++) {
                int num = ((row+col) % 2 == 0) ? 1:0;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }



    static  void pattern21(int n){

        int count = 1;
        for (int row = 1; row <= n  ; row++) {

            for (int col = 1; col <= row ; col++) {
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }
    }



    static  void pattern12(int n){

        for (int row = 1; row <= (2 * n) - 1 ; row++) {

            int totalSpaces = row > n ? (2 * n) - row - 1: row-1;
            int totalColInRow = row > n ? row - n + 1   : n - row + 1;

            for (int spaces = 1; spaces <= totalSpaces ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern11(int n){
        for (int row = 1; row <= n ; row++) {

            for (int spaces = 1; spaces <= row - 1  ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int row = 1; row <= n ; row++) {

            for (int spaces = 1; spaces <= n - row ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static  void pattern9(int n){
        for (int row = 1; row <= n ; row++) {

            int totalColInRow = 2 * (n - row) + 1;
            for (int spaces = 1; spaces <= row - 1  ; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static  void pattern8(int n){
        for (int row = 1; row <= n ; row++) {

            int totalColInRow = 2 * row - 1;
            for (int spaces = 1; spaces <= n - row ; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalColInRow ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static  void pattern7(int n){

        for (int row = 1; row <= n ; row++) {

            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern6(int n){
        for (int row = 1; row <= n ; row++) {

            for (int spaces = 1; spaces <= n - row ; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static  void pattern30(int n){

        for (int row = 1; row <= n ; row++) {

            for (int spaces = 0; spaces < n - row ; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }

    }


    static  void pattern28(int n){

        for (int row = 1; row < 2 * n ; row++) {

            int totalColInRow = row > n ? 2 * n - row : row;
            int numberOfSpaces = n - totalColInRow ;

            for (int col = 0; col < numberOfSpaces ; col++) {
                System.out.print(" ");
            }


            for (int col = 0; col < totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static  void pattern5(int n) {

////        int i = 1;
////        for (int row = 1; row <= (n * 2) - 1  ; row++) {
////            if(row <= n){
////                for (int col = 1 ; col <= row ; col++) {
////                    System.out.print("* ");
////                }
////                System.out.println();
////            }else{
////                for (int col = 1; col <= n - i; col++) {
////                    System.out.print("* ");
////                }
////                i++;
////                System.out.println();
////            }
////        }

        for (int row = 1; row <= (2 * n) -1 ; row++) {
           int totalCol = row > n ? 2 * n - row : row;

            for (int col = 1; col <= totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    static  void pattern1(int n){

        for (int row = 1; row <= n ; row++) {

            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }


    }


    static  void pattern2(int n){

        for (int row = 1; row <= n ; row++) {

            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }
    }


    static  void pattern3(int n){

        for (int row = 1; row <= n ; row++) {

            // for every row, run the col
            for (int col = 1; col <= n - row +1; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }
    }


    static  void pattern4(int n){

        for (int row = 1; row <= n ; row++) {

            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.printf("%d ",col);
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }
    }


}
