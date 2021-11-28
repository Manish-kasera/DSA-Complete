package com.mani.Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        //subsequence(up,p);

        System.out.println(subsetRet(up,p));
    }


    public static void subsequence(String up,String p) {
       if(up.isEmpty()){
           System.out.println(p);
           return;
       }
       char ch = up.charAt(0);

       subsequence(up.substring(1),p+ch);
       subsequence(up.substring(1),p);
    }

    public static ArrayList<String > subsetRet(String up,String p) {
      if(up.isEmpty()){
          ArrayList<String > list = new ArrayList<>();
          list.add(p);
          return list;
      }
      char ch = up.charAt(0);
      ArrayList <String > left = subsetRet(up.substring(1),p+ch);
      ArrayList <String > right = subsetRet(up.substring(1),p);

      left.addAll(right);
      return left;

    }

}
