package com.mani.Oops.O1;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Wrapper Classes
        Integer num1= 10;
        Integer num2= 30;
//        System.out.println(num1.byteValue());
//        System.out.println(num2);

//        swap(a,b);
//        System.out.println(a+ " " + b);

//        swap(num1,num2);
//        System.out.println(num1 + " " + num2);


// You cannot modifies in final (primitive data type)
//        final  int IN = 1;
//        System.out.println(IN);
//        IN +=1; // error
//        System.out.println(IN);

        final A kunal = new A("Manish");
        kunal.name = "Kunal";

        // when a non primitive  is final , you cannot reassign it.
//        kunal = new A("new Objects");

        A obj;
        for (int i = 0; i <10000 ; i++) {
           obj = new A("random name");
        }


    }

     static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class  A{
    final int num = 33;
    String  name;

    public  A(String name){
        this.name = name;
    }



    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
