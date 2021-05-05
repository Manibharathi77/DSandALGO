package com.datastructure.Arrays;

import java.util.Arrays;

public class Merge2sortedArr {

   // [ 4, 6 , 7 ,8 ,9] + [ 2, 3, 6, 10, 11]
   // [ 2, 3, 4, 6, 6, 7, 8, 9, 10, 11]

    /**
     *  study merge sort before this problem
     */

    public static int[] mergeSort(int[] leftArr, int[] rightArr){

        int[] resultArray = new int[leftArr.length + rightArr.length];

        int i = 0, j = 0; int k = 0;

        int n1 = leftArr.length;
        int n2 = rightArr.length;

        // [ 4, 6 , 7 ,8 ,9] + [ 2, 3, 6, 10, 11]
        // [ 2, 3, 4, 6, 6, 7, 8, 9, 10, 11]
        while(i < n1 && j < n2){

            if(leftArr[i] <= rightArr[j]){
                resultArray[k++] = leftArr[i++];
            } else {
                resultArray[k++] = rightArr[j++];
            }

        }

        while(i < n1){
            resultArray[k++] = leftArr[i++];
        }

        while(j < n2){
            resultArray[k++] = rightArr[j++];
        }

        return resultArray;

    }

    public static void main(String[] args) {
        // [ 4, 6 , 7 ,8 ,9] + [ 2, 3, 6, 10, 11]
        // [ 2, 3, 4, 6, 6, 7, 8, 9, 10, 11]


        System.out.println(Arrays.toString(
                mergeSort(new int[]{4, 6 , 7 ,8 ,9},
                        new int[]{2, 3, 6, 10, 11})));
    }

}
