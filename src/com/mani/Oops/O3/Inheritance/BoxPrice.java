package com.mani.Oops.O3.Inheritance;



public  class BoxPrice extends BoxWeight{

    int boxPrice;

    BoxPrice(){
        super();
        this.boxPrice = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.boxPrice = other.boxPrice;
    }



    BoxPrice(double l,double h, double w,double weight,int boxPrice){
        super(l,h,w,weight);
        this.boxPrice = boxPrice;

    }
}
