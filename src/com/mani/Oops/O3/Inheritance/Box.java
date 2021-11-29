package com.mani.Oops.O3.Inheritance;

public cd class Box {
    double l;
    double h;
    double w;
    // double weight;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w){

        // super() // Objects class

        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){

        System.out.println("Running the box");
    }
}
