package com.mani.StringsAndStringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        String name = "Manish Kasera Hello Manish";

        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println(Arrays.toString(name.split(" ")));

        String a = " apple       ";
        System.out.println(a.strip());

        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));

    }
}
