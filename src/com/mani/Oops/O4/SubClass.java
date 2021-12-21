package com.mani.Oops.O4;



public class SubClass extends A{

    public SubClass(int num,String name){
      super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(1,"swjud");
         int n = obj.num;
    }
}


class SubSubclass extends SubClass{

    public SubSubclass(int num,String name){
        super(num,name);
    }


    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(1,"swjud");
        int n = obj.num;
    }
}

class SubClass2 extends A{

    public SubClass2(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(1,"swjud");
        int n = obj.num;

        System.out.println(obj instanceof A);
    }
}

