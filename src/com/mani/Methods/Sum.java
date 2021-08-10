package com.mani.Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = sum(num1,num2);
//        System.out.println(sum);

        sum2();
    }

      static void sum2() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    /*

    Access Modifier
    return type
    name
    arguments
    return statement

    return _type name(arguments){
      //body
      return statement;
    }

     */
    static  int sum(int a,int b){
        return a+b;

    }
}
