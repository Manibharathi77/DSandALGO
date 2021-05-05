package com.datastructure.Arrays;

import java.util.Arrays;

public class RightRotateArrayByNIndex {

    /**
     * Reversal algorithm can be used to right rotate an array.
     */

    // {5, 6, 9, 12, 18, 44} -> n = 2 [5,6] , length = 6

    public static int[] getRotatedArray(int[] arr, int n){

        // A = 5, 6 : b = 9, 12, 18, 44
        // reverse a, reverse b, reverse ab

        reverse(arr, 0 , n-1);
        reverse(arr, n, arr.length -1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] reverse(int[] arr, int start, int end){
        //9, 12, 18, 44
        for(int i = start; i < end; i++){ //start = 2, end = 5
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRotatedArray(new int[]{1,2,9, 12, 18, 44}, 2)));
//        System.out.println(Arrays.toString(reverse(new int[]{9, 12, 18, 44}, 0, 3)));
    }



}
