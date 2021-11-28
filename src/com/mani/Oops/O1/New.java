package com.mani.Oops.O1;

public class New {
    public static void main(String[] args) {

        Stdnt one = new Stdnt("Kunal",3);

        // this basically means two and one is pointing
        // to the same objects
        Stdnt two = one;
        one.name = "Sachin";

        System.out.println(two.name);
        System.out.println(one.name);

        two.name = "Verma";

        System.out.println(two.name);
        System.out.println(one.name);
    }
}

class Stdnt{

    int roll;
    String  name;

    Stdnt(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

}
