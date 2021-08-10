package com.mani.Conditions_and_Loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        char ch = input.next().charAt(0);
        char ch = input.next().trim().charAt(0);
        

//        if(ch >= 65 && ch <= 90 ){
//            System.out.println("UpperCase");
//        }else if(ch >= 97 && ch <= 122){
//            System.out.println("LowerCase");
//        }

        if(ch >= 'A' && ch <='Z'){
            System.out.println("UpperCase");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }

    }
}
