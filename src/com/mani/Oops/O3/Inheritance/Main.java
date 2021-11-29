package com.mani.Oops.O3.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(3.66d);
//        Box box3 = new Box(3.66,3.2,7.2);
//
//        Box box4 = new Box(box2);
//
////        Give error as no constructor having 2 value pass
//        //Box box4 = new Box(3.66,3.2);
//
//        System.out.println(box1.l+" " + box1.w + " " + box1.h);
//        System.out.println(box2.l+" " + box2.w + " " + box2.h);
//        System.out.println(box3.l+" " + box3.w + " " + box3.h);
//        System.out.println(box4.l+" " + box4.w + " " + box4.h);

        BoxWeight   box5 = new BoxWeight();
        BoxWeight   box6 = new BoxWeight(1.2,332.2,13.12,10.00);
        System.out.println(box5.weight + " "+" "+ box5.h );
        System.out.println(box6.weight + " "+" "+ box6.h );





        Box box7 = new BoxWeight(2,3,4,55);

        System.out.println(box7.l);
        // System.out.println(box7.weight); // can't excess


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
       // BoxWeight box8 = new Box(2,4,45); // error


        BoxPrice p1 = new BoxPrice(1,34,63,433,2343);
        System.out.println(p1.boxPrice);
        System.out.println(p1.weight);
        System.out.println(p1.l);

        BoxPrice p2 = new BoxPrice(p1);
        System.out.println(p2.weight);
        System.out.println(p2.boxPrice);



     }
}
