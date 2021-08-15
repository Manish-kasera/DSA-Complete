package com.mani.Linear_Search;

public class Evendigits {
    public static void main(String[] args) {

//        int[] nums = {1,3,4,11,29,293,1333};
//        int ans = findNumbers(nums);
//        System.out.println(ans);

//        System.out.println(digits(-8383));
        System.out.println(digits2(-118383));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        
        for(int ele : nums){
            if(even(ele)){
                count++;
            }
        }
        
        return count;
    }

    static boolean even(int ele) {

        int numberOfDigits = (digits(ele));

/*
//        if(numberOfDigits % 2 == 0){
//            return true;
        }
        return false;
*/

        return  numberOfDigits % 2 == 0;
    }


    static int digits2(int num){

        if(num < 0){
            num *= -1;
        }
        if(num == 0){
           return 1;
        }
        return (int)(Math.log10(num)+1);
    }

    static int digits(int num){
        if(num < 0 ){
            num *= -1;
        }

        if(num == 0){
            return 1;
        }

     int count = 0;

     while(num!=0){
         count++;
         num /=10;
     }
     return count;
    }
}
