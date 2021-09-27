package com.mani.MathsAssignment;

class NthUgly {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
    }
    public static int nthUglyNumber(int n) {

        if(n <= 6){
           return n;
        }
        n -= 6;
        int num = 7;

       while( n != 0){
          if(isUgly(num)){
              n--;
              num++;
          }else{
              num++;
          }
       }
       return num-1;
    }

    public static boolean isUgly(int num) {

        while(num > 1){
            if(num % 2 == 0){
                num = num/2;
            }
            else if(num % 3 == 0){
                num = num/3;
            }
            else if(num % 5 == 0){
                num = num/5;
            }else{
                return false;
            }
        }
        return true;
    }
}