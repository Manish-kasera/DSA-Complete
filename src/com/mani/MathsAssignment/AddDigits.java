package com.mani.MathsAssignment;
// https://leetcode.com/problems/add-digits/
class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {

        if(num <= 9){
            return num;
        }

        int temp = num;

        while(temp >= 10){
            int sum = 0;
            while(num != 0){
                  int last = num % 10;
                  sum += last;
                  num /= 10;
            }
            temp = sum;
            num = sum;
        }
        return temp;
    }
}