package com.mani.Conditions_and_Loops;


public class Conditions {
    public static void main(String[] args) {
    /*

     if(boolean expression T or F){
       //body
     }else{
       // do this
     }

     */
       int salary = 25000;
//       if(salary>10000){
//           salary = salary + 2000;
//       }else{
//           salary = salary + 1000;
//       }
//        System.out.println(salary);

   if(salary>20000){
       salary +=2000;
   }else if(salary>10000){
       salary +=1000;
   }else{
       salary += 500;
   }
        System.out.println(salary);


    }
}
