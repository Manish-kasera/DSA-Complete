package com.mani.ArrayAssignment;

class Rotation {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1},
        };

        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };

        boolean ans = findRotation(arr,target);
        System.out.println(ans);

    }
    public static boolean findRotation(int[][] mat, int[][] target) {

        int c1 = 0,c2 = 0;
        for (int row = 0; row < mat.length ; row++) {
            for (int col = 0; col < mat[row].length ; col++) {
                if(mat[row][col] == 1){
                    c1++;
                }
            }
        }

        for (int row = 0; row < target.length ; row++) {
            for (int col = 0; col < target[row].length ; col++) {
                if(mat[row][col] == 1){
                    c2++;
                }
            }
        }

        return  c1==c2;
    }
}