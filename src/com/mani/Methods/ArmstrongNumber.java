package com.mani.Methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        boolean ans = IsArmstrong(num);
        System.out.println(ans);

    }

    public static boolean IsArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += (rem * rem * rem);
            temp /=10;
        }
        return sum == num;

    }
}
