package com.mani.Oops.O2.StaticExample;

// this is a demo to initialization of static variable
public class StaticBlock {

    static int a = 5;
    static int b;

    // will only once when the first object is created
    // i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a *4 ;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

        StaticBlock.b += 23;
        StaticBlock obj2 = new StaticBlock();

        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

    }
}
