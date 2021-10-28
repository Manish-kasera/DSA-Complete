package com.mani.Revision;

public class Human {
    String fname = "John";
    String lname = "Doe";

    final int leg = 2;
    final int hand = 2;
    int x = 10;

    public static void main(String[] args) {

        Human manish = new Human(); // Creating an Object
        Human sachin = new Human();

        System.out.println(sachin.hand);
        // getting leg attributes from the class Human
//        System.out.println(manish.leg);

//        System.out.println(manish.x);
        System.out.println(sachin.x);
//        manish.hand = 22; // we are overriding the value of hand that was present in Human class

        manish.x = 23;
        sachin.x = 1334;
        System.out.println(manish.x);
        System.out.println(sachin.x);

    }

}

