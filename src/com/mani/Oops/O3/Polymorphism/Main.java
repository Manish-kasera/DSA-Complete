package com.mani.Oops.O3.Polymorphism;


public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Triangle triangle = new Triangle();
        Shapes square = new Square();

        circle.area();
    }
}
