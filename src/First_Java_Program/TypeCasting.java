package First_Java_Program;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
//        float num =input.nextFloat();
//        System.out.println(num);


        //type casting
//        int num = (int)73.4f;
//        System.out.println(num);

        //automatic type promotion in expression
//        int a=257;
//        byte b =(byte)(a); // 257 % 256
//

        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d=(a*b)/c;
        System.out.println(d);

//        byte b=40;
//        b=b*3; // error

        //int num='A';
//        System.out.println(num);

 // Java follow Unicode
//        System.out.println("नमस्ते");

   //Rules for type promotion
//        System.out.println(3*1.3f);
//        System.out.println(3*1.3);
//        System.out.println(3*1);
//        System.out.println(3.23 *1.383f );

//Conclusion
//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.48f;
//        double d= 19823.4432;
//
//        double result = (f*b)+ (i/c)- (d*s);
//        //float +int -double = double
//        System.out.println((f*b)+" " + (i/c)+" " + (d*s));
//        System.out.println(result);



    }
}
