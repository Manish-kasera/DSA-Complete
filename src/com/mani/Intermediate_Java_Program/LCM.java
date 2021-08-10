package com.mani.Intermediate_Java_Program;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = lcm(num1,num2);
        System.out.println(ans);

    }

    public static int lcm(int a, int b) {
        int ans = 1;

        ans = (a * b)/gcd(a,b);
        return ans;
    }

    public static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd(b % a,a);
    }
}
