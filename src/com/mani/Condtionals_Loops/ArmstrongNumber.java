package com.mani.Condtionals_Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int actualno = num;
        int sum=0;
        while(num!=0){
            int temp =num %10;
            sum+=(temp*temp*temp);
            num = num/10;
        }

        if(actualno==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
