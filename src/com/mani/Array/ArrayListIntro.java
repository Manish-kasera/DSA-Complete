package com.mani.Array;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        //Syntax (dono shi hai)
        ArrayList <Integer> al = new ArrayList<Integer>();
//        ArrayList <Integer> al = new ArrayList<>();

         // .add(),.get(),.set(),.contain(),.remove()
        al.add(28);
        al.add(38);
        al.add(21);
        al.add(2458);

/*
                System.out.println(al);
         There is no al[i] it's al.get(i)
                for (int i = 0; i < al.size(); i++) {
                    System.out.println(al.get(i));
                }
                for (int ele : al)
                    System.out.println(ele);
 */

        System.out.println(al);
        System.out.println(al.size());

        al.set(1,33);
        System.out.println(al);

        al.add(4);
        System.out.println(al);


       al.add(1,334);
        System.out.println(al);

        al.remove(2);
        System.out.println(al);

        boolean ans = al.contains(334);
        System.out.println(ans);


    }
}
