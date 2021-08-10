package com.mani.Conditions_and_Loops;


public class Occurance {
    public static void main(String[] args) {
        long num = 1385757679L;
        int element = 5,count = 0;
        while(num!=0){
            long temp = num % 10;
            if(temp == element)
                 count++;
             num /= 10;
        }
        System.out.println(count);
    }

}
