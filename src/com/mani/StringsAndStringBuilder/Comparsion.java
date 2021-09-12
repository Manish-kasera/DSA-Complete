package com.mani.StringsAndStringBuilder;

import java.util.Locale;

public class Comparsion {

    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";



        // ==
//        System.out.println(a==b);

        // creating two objects with same name

        String n1 = new String("Manish");
        String n2 = new String("Manish");

//        System.out.println(n1 == n2);
        // false because both n1 and n2 creating pointing
        // to different object with same name

        // .equals --> It only cares about the values
//        System.out.println(n1.equals(n2));
        // comparing value not reference variable

        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.equals(b));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(0));
        System.out.println(a.indexOf('n'));

    }
}
