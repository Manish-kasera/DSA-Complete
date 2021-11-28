package com.mani.Oops.O1;

public class Constructor {
    public static void main(String[] args) {

        Student student1 = new Student("Mansh",33,42.4f);
//        student1.name ="manish";
//        student1.roll = 32;


        System.out.println(student1.marks);
        System.out.println(student1.roll);
        System.out.println(student1.name);

        Student random = new Student(student1);
        System.out.println(random.name);

        Student  random2 = new Student();
    }

}

class Student{

      int roll;
      String name;
       float marks;

       Student(Student other){
           this.name =  other.name;
           this.roll =  other.roll;
           this.marks =  other.marks;
       }

       Student(){
//           this.roll = roll;
//           this.name = name;
//           this.marks = marks;

         // this is how you call a constructor from another constructor
         // internally : new Student();
           this("default name",13,134.234f);

       }

     // Student s1 = new Student("Manish",1,23.3f);
    // here,this will be replaced with s1
    Student(String name,int roll,float marks) {
        // this is basically replace the reference variable name
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
