package com.mani.Recursion.string;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {

//        subseq("","abc");
//        System.out.println(subseqRet("","abc"));

        subseqAscii("","abc");

    }

    static void subseq(String p,String un){

        if(un.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = un.charAt(0);
        subseq(p+ch,un.substring(1));
        subseq(p,un.substring(1));
    }


    static ArrayList<String> subseqRet(String p,String un){

        if(un.isEmpty()){
          ArrayList <String> list = new ArrayList<>();
          list.add(p);
          return list;
        }

        char ch = un.charAt(0);
        ArrayList<String> left = subseqRet(p+ch,un.substring(1));
        ArrayList<String> right = subseqRet(p,un.substring(1));

        left.addAll(right);

        return left;
    }


    static void subseqAscii(String p,String un){

        if(un.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = un.charAt(0);
        subseqAscii(p+ch,un.substring(1));
        subseqAscii(p,un.substring(1));
        subseqAscii(p+(ch + 0),un.substring(1));
    }



}
