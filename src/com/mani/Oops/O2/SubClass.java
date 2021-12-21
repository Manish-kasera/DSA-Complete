package com.mani.Oops.O2;

import com.mani.Oops.O4.A;

public class SubClass extends A {

    public SubClass(int num, String name){
      super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(1,"swjud");
         int n = obj.num;
    }
}
