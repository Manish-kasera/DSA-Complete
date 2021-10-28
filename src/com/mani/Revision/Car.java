package com.mani.Revision;

public class Car {

    int wheel ;
    int light ;
    String name = "Tesla";

    // Creating a class Constructor for the Car class
    public Car(String name,int wheel,int light) {
        this.wheel = wheel;
        this.light = light;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWheelLight(int wheel,int light){
        this.wheel = wheel;
        this.light = light;
    }

    static void demo(){
        System.out.println("function using static Keyword");
    }
    public void dem2(){
        System.out.println("Function using public keyword");
    }

//    public void getCarDetails(){
//        System.out.println(name);
//        System.out.println(wheel);
//        System.out.println(light);
//    }


    public String getName() {
        return name;
    }
    public int getWheel(){
        return wheel;
    }
    public int getLight(){
        return light;
    }

    public static void main(String[] args) {
          demo();
//        demo2(); // this will give compile error
    }
}
