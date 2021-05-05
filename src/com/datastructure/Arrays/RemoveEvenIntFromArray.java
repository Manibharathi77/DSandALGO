package com.datastructure.Arrays;

import java.util.Arrays;

public class RemoveEvenIntFromArray {

    /*
    time complexity -> O(n) ; space Complexity -> O(1)
     */

    public static int[] removePositiveInt(int[] arr){

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[counter] = arr[i];
                counter++;
            }
        }

        int[] finalArr = new int[counter];

       System.arraycopy(arr, 0, finalArr, 0, counter);

        return finalArr;
    }


    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 2, 9};
        System.out.println(Arrays.toString(removePositiveInt(arr)));
    }

}
