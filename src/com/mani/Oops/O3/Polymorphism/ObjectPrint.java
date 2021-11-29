package com.mani.Oops.O3.Polymorphism;

import com.mani.RecursionAssignment.OneToN;

public class ObjectPrint {

    int num ;
    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public  String  toString(){
       return  "manish";
    }


    public static void main(String[] args) {
      ObjectPrint obj = new ObjectPrint(343);
        System.out.println(obj);
    }
}
