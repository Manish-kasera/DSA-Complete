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
    }
}
