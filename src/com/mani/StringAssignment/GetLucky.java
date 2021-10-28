package com.mani.StringAssignment;
// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
class GetLucky {

    public static void main(String[] args) {
        System.out.println(getLucky("zbax",2));
    }
    public static int getLucky(String s, int k) {
        // iiii -->"9999" -->36  k = 1

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            int  x = s.charAt(i) - 96;
            builder.append(x);
        }

        while(k != 0){
            int sum = 0;
            for (int i = 0; i < builder.length() ; i++) {
                sum += (int) (builder.charAt(i) - '0');
            }
            builder.delete(0,builder.length());
            builder.append(sum);
            k--;
        }
     String ans = String.valueOf(builder);
      return Integer.parseInt(ans);
    }
}