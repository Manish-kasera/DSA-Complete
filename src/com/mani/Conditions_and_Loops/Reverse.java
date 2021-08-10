package com.mani.Conditions_and_Loops;

public class Reverse {
    public static void main(String[] args) {
        int num = 18324;

//        while(num != 0){
//            int rem = num % 10;
//            System.out.print(rem);
//            num /=10;
//        }

        int ans = 0;
        while(num!=0){
            int rem = num  % 10;
            num /=10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
