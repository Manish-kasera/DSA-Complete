package com.mani.Function_Assignment;

public class Grade {
    public static void main(String[] args) {
        int marks = 81;
        grade(marks);
    }

   static void grade(int marks) {
        if(marks <= 40)
            System.out.println("AA");
       if(marks >= 41)
           System.out.println("BB");
       if(marks >= 51)
           System.out.println("CC");
       if(marks >= 61)
           System.out.println("DD");
       if(marks >= 71)
           System.out.println("EE");
       if(marks >= 81)
           System.out.println("FF");
       if(marks >= 91 )
           System.out.println("Fail");
    }
}
