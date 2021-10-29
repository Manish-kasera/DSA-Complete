package com.mani.RecursionAssignment;
// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpper {
    public static void main(String[] args) {
        String s = "geDeKs";
        System.out.println(firstUpper(s,0));
    }

    public static char firstUpper(String s,int i) {

        if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
            return s.charAt(i);
        }else{
            return firstUpper(s,i+1);
        }
    }
}
