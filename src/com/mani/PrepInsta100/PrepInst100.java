package com.mani.PrepInsta100;

import java.util.ArrayList;
import java.util.Arrays;

public class PrepInst100 {

    public static void main(String[] args) {
//        posNeg1(0);

//        System.out.println(evenOdd2(16));

//        System.out.println(sumOfNNatural3(4));

//        System.out.println(sumOfNatural4(44));

//        System.out.println(sumOfRange5(2,10));

//        System.out.println(greatest6(10,-10));

//        System.out.println(greatest7(100,123,-133));

//        System.out.println(leap8(1300));

//        System.out.println(isPrime9(17));

//        primeInRange10(5,20);

//        System.out.println(sumOfDigits11(1298));

//        System.out.println(reverse12(760));

//        System.out.println(palindrom13(""));

//        System.out.println(isArmstrong14(155));

//        armstrongrange15(100,1000);

//        fibo16(15);

//        System.out.println(factorial17(6));

//        System.out.println(power18(2,10));

//        factor19(16);

//        System.out.println(strongNumber20(145));

//        System.out.println(isPerfect21(28));

//        System.out.println(isAutomorphicNumber22(376));

//        System.out.println(isHarshadMehta23(26));

//        System.out.println(abundantNumber24(12));

//        System.out.println(isFriendly25(3453,5545));

//        System.out.println(hcf26(15,35));

//        System.out.println(lcm27(2,4));

//        System.out.println(gcd28(13,13));

//        System.out.println(binaryToDecimal29(101011));

//        System.out.println(binaryToOctal30(1010));

//        System.out.println(Arrays.toString(decimalToBinary31(26)));

//        System.out.println(decimalToOctal32(147));

//        System.out.println(Arrays.toString(octalToBinary33(216)));

//          System.out.println(octalToDecimal34(45));

//        System.out.println(quadrant35(-1,-4));

//        System.out.println(permutation36(5,2));

//        System.out.println(hand37(10));

//            fractionSum38(1,3,3,9);

//        System.out.println(replace0With139(5003310));

//           expressPrime40(34);

//        System.out.println(possibleDecoding41(123));

//        System.out.println(vowelOfCons42('g'));

//        System.out.println(alphaOrNot43('&'));

//        System.out.println(area44(4));

//        System.out.println(assci45('f'));

//        prime46(1,100);

//        System.out.println(numDig47(2343));


    }

    public static int numDig47(int num) {
     int ans = (int) (Math.log(num)/Math.log(10)) + 1;
     return ans ;
    }

    public static void prime46(int start, int end) {

        for (int i = start; i <= end ; i++) {
            if(isPrime9(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static int assci45(char a) {
        return (int) a;
    }

    public static float area44(float r) {

        float area =(float) Math.PI  * r * r;
        return  area;
    }

    public static boolean alphaOrNot43(char c) {

        if(c >= 'a' && c < 'z' || c >= 'A' && c <= 'Z'){
            return true;
        }
        return false;
    }

    public static String vowelOfCons42(char c) {

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return "Vowel";
        }
        return "Const";

    }

    public static void expressPrime40(int num) {

        int count = 0;
        for (int i = 1; i <= num/2 ; i++) {

            if(isPrime9(i)){
                if(isPrime9(num-i)){
                    System.out.println(i + " "+ (num-i));
                    count = 1;
                }
            }
        }
        if(count == 0){
            System.out.println("Nahi Mila");
        }
    }

    public static int replace0With139(int num) {

        int rev = 0;
        while (num != 0){
            int temp = num % 10;
            if(temp == 0){
                temp = 1;
            }
            rev = rev * 10 + temp;
            num /= 10;
        }

        int temp = rev;
        rev = 0;
        while (temp != 0){
            int t = temp%10;
            rev = rev * 10 + t;
            temp/=10;
        }
        return rev;
    }

    public static void  fractionSum38(int num1, int deno1, int num2, int deno2) {

        int lcm = (deno1 * deno2)/gcd28(deno1,deno2);

        int n1 = (lcm / deno1) * num1;
        int n2 = (lcm / deno2) * num2;

        int numerator = n1 + n2;
        int denominator = lcm;

        int g = gcd28(numerator,denominator);
        System.out.println(numerator/g+"/"+denominator/g);

    }

    public  static int  hand37(int n){
       int r = 2;

       int ans = factorial17(n)/(factorial17(r)*factorial17(n-r));

       return ans;
    }

    public static int permutation36(int n, int r) {

        int ans = factorial17(n)/ factorial17(n-r);
        return ans;

    }

    public static int quadrant35(int x, int y) {

        if( x== 0 && y == 0){
            return 0;
        }

        if(x > 0 && y > 0){
            return 1;
        }else if(x > 0 && y < 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else {
            return 4;
        }
    }

    public static int octalToDecimal34(int oct) {
        int ans = octalToDecimal(oct);
        return ans;
    }

    public static int[] octalToBinary33(int octal) {
        int num = octalToDecimal(octal);
        int[] ans =decimalToBinary31(num);

       return ans;
    }

    private static int octalToDecimal(int octal) {
        int ans = 0;
        int base = 8;
        int count = 0;
        while(octal != 0){
            int temp = octal % 10;
            ans += (temp * Math.pow(base,count));
            octal /=10 ;
            count++;
        }
        return ans;
    }

    public static int decimalToOctal32(int num) {
        ArrayList <Integer> list = new ArrayList<>();
        int oct = 0;
        int count = 0;
        int base = 8;
        while(num != 0){
            int temp = num % 8;
            list.add(temp);
            num = num / 8;

        }

        int ans = 0;
        for(int i = list.size()-1 ;i >=0;i--){
            int temp = list.get(i);
            ans = ans * 10 + temp;
        }
        return ans;
    }

    public static int[] decimalToBinary31(int deci) {
        ArrayList <Integer> ans = new ArrayList();

        int n = 0;
        while(deci != 0){
             ans.add(deci % 2);
             deci /= 2;
             n++;
        }
        int[] binary = new int[n];

        int j=0;
        for (int i = ans.size() - 1; i >=0 ; i--) {
               binary[j] = ans.get(i);
               j++;
        }
        return binary;
    }

    public static int binaryToOctal30(int bin) {

        ArrayList <Integer> list = new ArrayList<>();
        int  num = binaryToDecimal29(bin);
        int oct = 0;
        int count = 0;
        int base = 8;
        while(num != 0){
            int temp = num % 8;
            list.add(temp);
            num = num / 8;

        }

        int ans = 0;
        for(int i = list.size()-1 ;i >=0;i--){
            int temp = list.get(i);
            ans = ans * 10 + temp;
        }
       return ans;
    }

    public static int binaryToDecimal29(int num) {

        int deci = 0;
        int count = 0;
        int base = 2;
        while(num != 0){
            int temp = num % 10;
            num = num / 10;
            deci +=  (temp * Math.pow(base,count));
            count++;
        }
        return deci;
    }

    public static int gcd28(int a, int b) {
      if( a == 0 ){
          return b;
      }
        return gcd28(b % a, a);
    }


    public static int lcm27(int a, int b) {
        return (a * b)/hcf26(a,b);
    }

    public static int hcf26(int a, int b) {

        if(a == 0){
            return b;
        }

        return hcf26(b % a,a);
    }

    public static boolean isFriendly25(int num1, int num2) {

        int sum1 = 0,sum2 = 0;
        for (int i = 1; i <= num1/2 ; i++) {
            if(num1 % i == 0){
                sum1 += i;
            }
        }

        for (int i = 1; i <= num2/2 ; i++) {
            if(num2 % i == 0){
                sum2 += i;
            }
        }

        return (sum1 == num2 && sum2 == num1);

    }

    public static boolean abundantNumber24(int num) {
        int sum = 0;
        for (int j = 1; j <= num/2 ; j++) {
            if(num % j == 0){
                sum += j;
            }
        }
        return sum < num;
    }


    public static boolean isHarshadMehta23(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0){
            sum += (temp % 10);
            temp /= 10;
        }
        if(num % sum == 0){
            return true;
        }
        return false;
    }

    public static boolean isAutomorphicNumber22(int num) {

        int temp = num,noOfDigit = 0;
        while ( temp != 0){
            temp /= 10;
            noOfDigit++;
        }

        int fake = (int) Math.pow(num,2);

        int lastFake = 0;
        int lastOrg = 0;
        int count = 0;
        for(int i = 1;i<= noOfDigit;i++){
            lastFake = fake % 10;
            fake /= 10;

            lastOrg = num % 10;
            num /= 10;

            if(lastFake == lastOrg){
                count++;
            }

        }
        return count == noOfDigit;


    }

    public static boolean isPerfect21(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2 ; i++) {
            if(num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    public static boolean strongNumber20(int num) {

        int sum = 0;
        int temp = num;
        while(temp != 0){
            int last = temp % 10;
            sum += factorial17(last);
            temp /= 10;
        }

        return num==sum;
    }

    public static void factor19(int num) {

        System.out.print(1+" ");
        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0)
                System.out.print(i+" ");
        }
        System.out.print(num);
    }

    public static int power18(int num, int pow) {

        if(pow == 1)
            return num;
        return num * power18(num,pow-1);
    }


    public static int factorial17(int i) {
       if(i == 1)
           return 1;
       return i * (factorial17(i-1));
    }

    public static void fibo16(int num) {
        int first = 0,second = 1;

        System.out.print(first+" "+second+" ");

        while (first+second <= num){
            int temp = first;
            first = second;
            second = temp + first;
            System.out.print(second+" ");
        }

    }

    public static void armstrongrange15(int start, int end) {

        while (start <= end){
            boolean ans = isArmstrong14(start);
            if(ans){
                System.out.print(start +" ");
            }
            start++;
        }

    }

    public static boolean isArmstrong14(int num) {
        int temp = num;
        int sum = 0;
        while (temp !=0){
            int last = temp % 10;
            sum += (Math.pow(last,3));
            temp /= 10;
        }

        return num==sum;
    }

    public static boolean palindrom13(String s) {

        int start = 0 ,end = s.length()-1;
        while (start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static int reverse12(int num) {

        int rev = 0;
        while (num != 0){
            int temp = num % 10;
            rev = rev * 10 + temp;
            num /= 10;
        }
        return rev;
    }

    public static int sumOfDigits11(int num) {

        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void primeInRange10(int start, int end) {

        while(start <= end){

            int count = 0;
            for(int i = 2; i * i <= start;i++) {
                if (start % i == 0) {
                 count = 1;
                }
            }
            if(count == 0){
                System.out.print(start+" ");
            }
            start++;
        }
    }

    public static boolean isPrime9(int num) {

        for (int i = 2; i * i <= num ; i++) {
           if(num % i == 0){
               return false;
           }
        }
        return true;
    }

    public static boolean leap8(int year) {

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                      return true;
        else
           return false;
    }

    public static int greatest7(int a, int b, int c) {

        int temp = Math.max(a,b);
        return Math.max(temp,c);

    }

    public static int greatest6(int a, int b) {
        if( a > b)
            return a;
        return b;
    }

    public static int sumOfRange5(int start, int end) {

        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfNatural4(int n) {

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfNNatural3(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }

        return sum;
    }

    public static boolean evenOdd2(int n) {
        if(n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void posNeg1(int n){
        if(n == 0){
            System.out.println("zero");
        }else if( n > 0){
            System.out.println("Positive");
        }else{
            System.out.println("negative");
        }
    }
}
