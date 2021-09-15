package com.mani.StringsAndStringBuilder;

import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a"+"b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after few steps "a" + "1"
       // integer will be converted to Integer that will call toString()

        System.out.println("Kunal " + new ArrayList<>());
        System.out.println("Kunal " + new Integer(567));

//        System.out.println(new Integer(44) + new ArrayList<>());
        // error

        System.out.println(new Integer(44) + " "+ new ArrayList<>());

    }
}
