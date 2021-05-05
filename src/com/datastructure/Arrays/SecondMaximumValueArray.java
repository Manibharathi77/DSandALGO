package com.datastructure.Arrays;

import java.util.Arrays;

public class SecondMaximumValueArray {

    // {9, 7, 5, 0, 9, 7, 1}  ->>> 7

    public static void getSecondLargestValue(int[] arr, int n){

        // Sort the given array. (Merge sort) O(n Log n)
        // find the required array. provided the value is not repeated earlier.

        int leftIndex = 0; int rightIndex = arr.length - 1;

        sort(arr, leftIndex, rightIndex);
        System.out.println(Arrays.toString(arr));

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i -1]){
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("No second largest value found");


    }

    private static void sort(int[] arr, int leftIndex, int rightIndex) {

        if(leftIndex < rightIndex){

            // sort left and right array. -> calc mid point

            int midPoint = (leftIndex + rightIndex)/2;
            sort(arr, leftIndex, midPoint);
            sort(arr, midPoint+1, rightIndex);
            merge(arr, leftIndex, midPoint, rightIndex);

        }
    }

    private static void merge(int[] arr, int leftIndex, int midPoint, int rightIndex) {

        int n1 = midPoint - leftIndex + 1;
        int n2 = rightIndex - midPoint;
        //  {9, 7, 5, 0, ----  9, 7, 1}  // r - 6

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[leftIndex+i];
        }

        for(int i = 0; i < n2; i++){
            rightArray[i] = arr[midPoint+1+i];
        }

        int i = 0; int j = 0; int k = leftIndex;

        while(i < n1 && j < n2){
            if(leftArray[i] < rightArray[j]){
                arr[k++] = rightArray[j++];
            } else {
                arr[k++] = leftArray[i++];
            }
        }

        while(i < n1){
            arr[k++] = leftArray[i++];
        }

        while(j < n2){
            arr[k++] = rightArray[j++];
        }

    }

    public static void main(String[] args) {
        getSecondLargestValue(new int[]{9, 9}, 2);
    }

}
