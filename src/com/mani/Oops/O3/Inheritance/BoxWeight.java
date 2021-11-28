package com.mani.Oops.O3.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public  BoxWeight(){
       this.weight = -1;
    }

    public BoxWeight(double l,double h, double w,double weight){

        super(l,h,w); // what is this ? call the parent class constructor
        // use to initialise values present in parent class constructor
        this.weight = weight;
    }

}
