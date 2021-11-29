package com.mani.Oops.O3.Polymorphism;

public class Numbers {

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    double sum(double a,double b){
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,4,3);
        obj.sum(8,2);
        obj.sum(1.3,3);
    }

}
