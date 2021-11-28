package com.mani.Oops.O1;

public class Greeting {
    public static void main(String[] args) {

        Stud s1 = new Stud("Manish",12,34.5f);

        s1.changeName("Sachin");
        s1.greeting();

    }

}

class Stud{
    int roll;
    float marks;
    String name;

    void greeting (){
        System.out.println("Hey I am "+ this.name);
    }
    void changeName(String newName){
        this.name = newName;
    }

    Stud(String name,int roll,float marks){
        this.marks = marks;
        this.name=name;
        this.roll = roll;
    }

}
