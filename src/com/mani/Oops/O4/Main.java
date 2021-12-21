package com.mani.Oops.O4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        A obj = new A(3,"Kunal");

        // need to do a few things
        //1. access the data members
        // 2. modifies the data member

//        ArrayList <Integer> list = new ArrayList<>();

        // obj.num // error because num is private

        System.out.println(obj.getNum());

        //int ans = obj.temp; // in different package it will
        // not allow but in same package it will allow (default one ->
        // don't specify anything)

        int a = obj.num;

    }
}
