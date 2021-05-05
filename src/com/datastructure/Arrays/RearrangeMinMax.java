package com.datastructure.Arrays;

import java.util.Arrays;

public class RearrangeMinMax {

    //{ 5, 9, 18, -6, -12, -44}  ->  {18, -44, 9, -12, 5, -6} max/min/max/min

    public static int[] rearrange(int[] arr){
        // sort the array using merge sort
        mergeSort(arr, 0, arr.length-1);
        // have the two pointer method to rearrange in the sorted position.
        int[] finalArr = new int[arr.length];
        int pointerRight = arr.length - 1, pointerLeft = 0;
        int k = 0;
        while(pointerRight > pointerLeft){
            finalArr[k++] = arr[pointerRight--];
            finalArr[k++] = arr[pointerLeft++];
        }

  return finalArr;
    }

    private static void mergeSort(int[] arr, int leftIndex, int rightIndex){

        if(leftIndex < rightIndex){  // 0, 5

            int midpoint =leftIndex + (rightIndex-leftIndex)/2;

            mergeSort(arr, leftIndex, midpoint);
            mergeSort(arr, midpoint+1, rightIndex);
            merge(arr, leftIndex, midpoint, rightIndex);
        }

    }

    private static void merge(int[] arr, int leftIndex,
                              int midPoint, int rightIndex) {

        //c create two arrays.

        int n1 = midPoint - leftIndex + 1;
        int n2 = rightIndex - midPoint;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[leftIndex + i];
        }
        for(int i = 0; i < n2; i++){
            rightArray[i] = arr[midPoint + 1 + i];
        }

        int i = 0, j = 0, k = leftIndex;
        // 5, 9,   -6, 18
        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }

            while(i < n1){
                arr[k++] = leftArray[i++];
            }
            while(j < n2){
                arr[k++] = rightArray[j++];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange(new int[]{ -1, 2, -9, 12, 18, -44, 44 })));
    }

}
