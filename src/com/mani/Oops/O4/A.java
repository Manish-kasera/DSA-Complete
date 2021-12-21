package com.mani.Oops.O4;

public class A {
    protected int num;
    String name;
    int[] arr;
    int temp;

    public int getNum(){
        return num;
    }
    public  void setNum(int num){
        this.num = num;
    }

    protected A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}
