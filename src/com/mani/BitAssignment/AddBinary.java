package com.mani.BitAssignment;

import java.util.Arrays;

//https://leetcode.com/problems/add-binary/
class AddBinary {

    public static void main(String[] args) {
//        System.out.println(addBinary("11","1"));

        System.out.println(addBinary2("11","1"));
    }


    public  static  String addBinary2(String  a, String b){
        char[] aArray = a.toCharArray(), bArray = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = aArray.length - 1, j = bArray.length - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? aArray[i] - '0' : 0) + (j >= 0 ? bArray[j] - '0' : 0) + carry;

            sb.append(sum % 2);
            carry = sum / 2;

            if (i >= 0) i--;
            if (j >= 0) j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    // bahot he Jada mehnat lgga hai
    public static String addBinary(String a, String b) {

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int x = binaryToDecimal(num1);
        int y = binaryToDecimal(num2);

        int[] arr = decimalToBinary(x+y);

        StringBuilder builder = new StringBuilder();
        for(int s : arr) {
            builder.append(s);
        }
        String str = builder.toString();

        return str;

    }

    public static int[] decimalToBinary(int decimal) {

        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary [index++] = decimal % 2;
            decimal /= 2;
        }

        int n = index;
        int[] ans = new int[n];
        int count = 0;
        for(int i = index-1;i >= 0;i--){
            ans[count] = binary[i];
            count++;
        }
       return ans;

    }

    public static int binaryToDecimal(int num) {

        int sum = 0,count = 0;
        int base = 2;
        while(num != 0){
            int temp = num & 1;
            sum += (temp * Math.pow(base,count));
            count++;
            num /= 10;
        }
        return sum;
    }
}