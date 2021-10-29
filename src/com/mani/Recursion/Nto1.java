package com.mani.Recursion;

public class Nto1 {

    public static void main(String[] args) {

        int num = 5;
//        nto1(num);

//        oneton(num);

        funBoth(num);

    }


    public static void funBoth(int num) {
        if(num < 1){
            return;
        }
        System.out.print(num + " "); //5 4 3 2 1
        funBoth(num-1);
        System.out.print(num + " "); // 1 2 3  4 5
    }

    public static void oneton(int num) {
        if(num < 1){
            return;
        }
        oneton(num-1);
        System.out.print(num + " "); // 1 2 3  4 5
    }

    static  void nto1(int num){
        if(num == 1){
            System.out.print(num); //1
            return;
        }
        System.out.print(num+" "); // 5 4 3 2
        nto1(num -= 1);
    }

}
