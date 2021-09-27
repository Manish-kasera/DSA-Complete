package com.mani.Bitwise;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.println(isEven(229));
    }

    public static boolean  isEven(int num) {
      return (num & 1) == 0;
    }
}
