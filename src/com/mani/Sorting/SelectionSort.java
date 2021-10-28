package com.mani.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4342,52,1244,22223,99998};
        System.out.println(Arrays.toString(arr));

//        selectionSort1(arr);
//        System.out.println(Arrays.toString(arr));

        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


    // selecting maximum element and putting in correct indexes
    static void selectionSort2(int[] arr) {

        /*
            4 5 1 2 3 --> Unsorted
            4 3 1 2 | 5
            2 3 1 || 4 5
            2 1 ||| 3 4 5
            1 |||| 2 3 4 5  -->Sorted
         */

        int n = arr.length;


        for (int i = 0; i < n -1 ; i++) {
            // find the maximum element in the remaining array and swap with correct index
            int max_in = 0;
            int last = arr.length -i -1;
            for (int j = 0; j < n - i ; j++) {

                if(arr[max_in] < arr[j]){
                    max_in = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[max_in];
            arr[max_in] = temp;
        }
    }

    static void selectionSort1(int[] arr) {

        // selecting minimum element and putting in correct index

        /*
          4 5 1 2 3 -->Unsorted
          1 | 5 4 2 3
          1 2 || 4 5 3
          1 2  ||| 3 5 4
          1 2 3 4 |||| 5 --> Sorted

         */
        for (int i = 0; i <arr.length -1 ; i++) {
            int min_in =  i;
            for (int j = i; j < arr.length ; j++) {

                if(arr[j] < arr[min_in]){
                 min_in = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[min_in];
            arr[min_in] = temp;
        }
    }

}
