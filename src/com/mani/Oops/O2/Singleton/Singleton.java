package com.mani.Oops.O2.Singleton;


import com.mani.Oops.O4.A;

// Singleton class can create only one objects
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
     // check whether one object only created or not

        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
