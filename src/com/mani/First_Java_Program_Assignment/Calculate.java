package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char sign = input.next().charAt(0);

        if(sign=='+'){
            System.out.println(num1+num2);
        }else if(sign=='-'){
            System.out.println(num1-num2);
        }else if(sign=='*'){
            System.out.println(num1*num2);
        }else if(sign=='/'){
            System.out.println(num1/num2);
        }else if(sign=='%'){
            System.out.println(num1%num2);
        }
    }
}
