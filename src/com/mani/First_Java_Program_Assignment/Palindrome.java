package com.mani.First_Java_Program_Assignment;

public class Palindrome {
    public static void main(String[] args) {
        String str ="abaedf";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        int start = 0,end = str.length() - 1;
        while(start <= end){
            if (str.charAt(start++) != str.charAt(end--)){
                return false;
            }

        }
        return true;
    }
}
