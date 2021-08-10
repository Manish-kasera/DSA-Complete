package com.mani.Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String s = returnString(name);
        System.out.println(s);
    }
    static String returnString(String name){
        return "Hello " + name;
    }
}
