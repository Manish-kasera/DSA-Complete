package com.mani.Recursion;

public class CountZeros {
    public static void main(String[] args) {
//        int ans = count1(30304);
//        System.out.println(ans);

//        int ans = count2(334);
//        System.out.println(ans);

        int ans = count3(300,0);
        System.out.println(ans);
    }

    // special pattern,how to pass a value in above calls
    public static int count3(int num, int count) {
        if(num == 0){
            return count;
        }
        if(num % 10 == 0){
            return count3(num/10,count+1);
        }
        return count3(num/10,count);
    }


    public static int  count2(int num){

        if(num == 0){
            return 0;
        }

        if(num % 10 == 0){
            return 1 + count2(num/10);
        }
        return count2(num/10);
    }


    public static int count1(int num) {
        int count = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
