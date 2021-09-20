package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class Length {

    public static void main(String[] args) {
        System.out.println(length("Mnisd"));
    }

    public static int length(String str){

        if (str.equals(""))
            return 0;
        else
            return length(str.substring(1)) + 1;


    }
}
