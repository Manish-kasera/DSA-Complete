package com.mani.Oops.O2.StaticExample;

public class Main {
    public static void main(String[] args) {

      Human kunal = new Human(12,"Kunal",100000,false);
      Human rahul = new Human(32,"Rahul",1000,true);


        System.out.println(kunal.salary);
        System.out.println(rahul.name);

        System.out.println(kunal.population);
        System.out.println(rahul.population);

        System.out.println(Human.population);

        // inside a static method we can't use anything that is non-static
        // greeting();  // error


    }

    // this is not dependent on an objects
    static  void fun(){
       // greeting(); // you can't use this because
        // it requires an instance but the function
        // you are using it doesn't depend on instance

        // you can't access non-static stuff without referencing their instance
        // in a static context
        Main obj = new Main();
        obj.greeting();
    }

    // we know that something which is not static, belongs to an objects
    void greeting(){
//        fun();
        System.out.println("Hello World");
    }
}
