package com.mani.Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10;
        int b = 20;

//       swap number code
//        int temp = a;
//        a = b;
//        b = temp;

//         swap(a,b);
//         System.out.println(a +" " +b);

         String name = "Manish Kasera";
         changeName(name);
         System.out.println(name);

    }

    static void changeName(String name) {
        name = "Rahul Rana"; // Creating a new object
    }

    static  void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this functions scope only.
    }
}
