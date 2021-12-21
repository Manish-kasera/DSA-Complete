package com.mani.Oops.O4;

public class ObjectDemo {

    int num;
    String name;
    float gpa;

    // already covered
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // already covered
    @Override
    public String toString() {
        return super.toString();
    }

    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }



    // we will go in details of how to create in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    // hashcode gives  a random unique number so that we can identify
    // the same object or the dfr object

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(123);
//        System.out.println(obj.hashCode());
//
//        ObjectDemo obj2 = new ObjectDemo(123);
//        System.out.println(obj2.hashCode());
//
//        ObjectDemo obj3 = obj2;
//        System.out.println(obj2.hashCode());


        ObjectDemo obj4 = new ObjectDemo(12,56.8f);
        ObjectDemo obj5 = new ObjectDemo(12,78.9f);

        if(obj4 == obj5){
            System.out.println("obj4 is equal to Obj5");
        }

        if(obj4.equals(obj5)){
            System.out.println("obj4 is equal to Obj5");
        }

        System.out.println(obj4.getClass());
        System.out.println(obj4.getClass().getName());
    }


}
