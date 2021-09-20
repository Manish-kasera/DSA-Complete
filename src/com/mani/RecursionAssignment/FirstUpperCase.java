package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpperCase {

    public static void main(String[] args) {
        String s ="mAnish";
        int l = s.length();
        System.out.println(firstUpperCase(s,l));


    }

    static  char  firstUpperCase(String s,int n){

      if(s.charAt(n - 1) == '\0')
          return '0';

      if (s.charAt(n-1) >= 65 && s.charAt(n-1) <= 90)
          return s.charAt(n-1);
      else
         return firstUpperCase(s,n-1);
    }
}
