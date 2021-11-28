package com.mani.Oops.O2.StaticExample;

// outside classes can't be static
public class InnerClasses {
     static class Test{
          String name;

          Test(String  name){
              this.name = name;
          }

    }

    public static void main(String[] args) {
        Test a = new Test("Manish");
        Test b = new Test("Sachin");

        System.out.println(a.name);
        System.out.println(b.name);
    }

}

