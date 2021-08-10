package com.mani.Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println(a);
//        System.out.println(b);
//        int a = 23; //cannot initize again
         a = 10 ;
//        fun();
        {
            a = 100; //reassign  the origin ref variable to some other value
            int c = 27;
            System.out.println(a);
            System.out.println(c);
            //value initize in this block, will remains in the block
        }
        int c = 273;
        System.out.println(c);
//        System.out.println(c); //can't be outside block
        System.out.println(a);


        //scoping in for loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i);


    }

    static void fun() {
        int x = 20;
        int num = 13;
        System.out.println(x);
        System.out.println(num);

    }
}
