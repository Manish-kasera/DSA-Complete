package com.mani.Oops.O1;

public class Main {

    private static Students kunal;

    public static void main(String[] args) {
        // store five roll number
        int[] roll = new int[5];

        // store five names
        String[] names = new String[5];

        // data of 5 students: {roll,name,marks}
        int[] roll_n = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //Students[] student = new Students[5];

      // Declaring a variable
       // Students kunal;

        // declaring and creating an object
        Students kunal = new Students();

        kunal.name = "Kunal";
        kunal.roll = 54;
//        kunal.marks = 34.3f;

        System.out.println(kunal.roll);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);


    }

}
// create a class
// class class_name
class Students{
    int  roll = 4;
    String name = "Manish";
    float marks = 2343.4f;
}
