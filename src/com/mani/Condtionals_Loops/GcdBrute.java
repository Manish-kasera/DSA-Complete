package com.mani.Condtionals_Loops;

import java.util.Scanner;

public class GcdBrute {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = gcdBrute(num1,num2);
        System.out.println(ans);
    }

   public static int gcdBrute(int num1, int num2) {
        int ans = 1;
        int small = Math.min(num1,num2);

        for (int i = small; i >=1 ; i--) {
            if(num1 % i == 0){
                if(num2 % i == 0){
                  ans = i;
                  break;
                }
            }
        }

        return ans;
    }
}
