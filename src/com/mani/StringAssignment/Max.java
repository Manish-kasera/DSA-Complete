package com.mani.StringAssignment;
// https://leetcode.com/problems/maximum-repeating-substring/
class Max {

    public static void main(String[] args) {
        System.out.println(maxRepeating("abab","ab"));
    }

    public  static  int maxRepeating(String seq, String word){

//        int count=0;
//        StringBuilder build = new StringBuilder();
//        while (build.toString().length()<= sequence.length()){
//            if(sequence.contains(word)){
//                build.append(word);
//                count++;
//            }else{
//                break;
//            }
//        }
//        return count;

        int k = 0;
        StringBuilder str = new StringBuilder(word);
        while (str.toString().length() <= seq.length()) {
            if (seq.contains(str.toString())) {
                str.append(word);
                k++;
            }
            else
                break;
        }
        return k;
    }
}