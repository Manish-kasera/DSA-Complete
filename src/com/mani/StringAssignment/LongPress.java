package com.mani.StringAssignment;

class LongPress {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed","ssaaedd"));
    }

    public static boolean isLongPressedName(String name, String typed) {

        int count = 0;
        for (int i = 0; i < name.length() ; i++) {

            for (int j = i; j < typed.length() ; j++) {
                if(name.charAt(i) == typed.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count == name.length();

    }
}