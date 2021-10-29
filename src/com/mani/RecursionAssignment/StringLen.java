package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class StringLen {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println(strlen(s));
    }

    public static int strlen(String s) {
      if(s.isEmpty()){
          return 0;
      }
      return 1 + strlen(s.substring(1));

    }
}
