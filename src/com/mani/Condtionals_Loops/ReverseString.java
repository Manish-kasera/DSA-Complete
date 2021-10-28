package com.mani.Condtionals_Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String forward = in.nextLine();
        System.out.println(forward);

        int len = forward.length();
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(forward.charAt(i));
        }
    }
}
