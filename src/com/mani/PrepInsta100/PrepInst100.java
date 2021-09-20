package com.mani.PrepInsta100;

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
