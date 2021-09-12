package com.mani.ArrayAssignment;

import java.util.Arrays;

class FlippingImage {

    public static void main(String[] args) {
        int[][] image = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        int[][] ans = flipAndInvertImage(image);

    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int row = 0; row < image.length ; row++) {

            for (int col = 0; col < image[row].length/2 ; col++) {

                if(image[row][col] != image[row][image[row].length - col-1]){

                    int temp = image[row][col];
                    image[row][col] = image[row][image[row].length -col-1];
                    image[row][image[row].length -col-1] = temp;
                }
            }
        }

        for (int row = 0; row < image.length ; row++) {
            for (int col = 0; col < image[row].length ; col++) {

                if(image[row][col] == 1){
                    image[row][col] = 0;
                }else {
                    image[row][col] = 1;
                }
            }
        }

        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[i].length ; j++) {
                System.out.println(image[i][j]+" ");
            }
            System.out.println();
        }

        return image;
    }
}