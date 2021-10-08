package com.mani.Revision;

public class Human {

    int leg = 2;
    int hand = 2;

    void hello(String  name){
        System.out.println("Speak "+ name);
    }

    public static void main(String[] args) {

        Human Manish = new Human();
        System.out.println(Manish.leg);
        System.out.println(Manish.hand);
        Manish.hello("Manish");
    }
}
