package com.mani.Oops.O3.Polymorphism;

public class Circle extends Shapes{


    // this will run when circle obj is created
    // hence it is overriding the parent method

    @Override // this is called annotation
    // used for simple check
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
