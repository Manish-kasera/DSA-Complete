package com.mani.Intermediate_Java_Program;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = gcd(num1,num2);
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {

        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }

        if(a == b){
            return a;
        }

        if(a>b){
            return gcd(a-b,b);
        }else{
            return gcd(a,b-a);
        }


    }
}
