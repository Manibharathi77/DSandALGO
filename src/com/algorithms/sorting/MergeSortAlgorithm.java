package com.algorithms.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {

    // [7, 5, -1, 6, 8, 5]

    public static void sort(int[] arr, int leftIndex, int rightIndex){

        // keep dividing the array into two, until only one remains in the array.

//        7, 5, -1

        if(leftIndex < rightIndex){

//            int midPoint = (rightIndex - leftIndex)/2;  //
            int midPoint =leftIndex + (rightIndex-leftIndex)/2;

            sort(arr, leftIndex, midPoint);
            sort(arr, midPoint + 1, rightIndex);
            merge(arr, leftIndex, midPoint, rightIndex); // {7, 5} , 0, 1, 1

        }




    }


    // {7, 8, 12 --- 1, 11, 15}

    private static void merge(int[] arr, int leftIndex, int midPoint, int rightIndex) {

        // Create 2 separate array to store left and right arrays // unsorted ones.
        // To do that, calculate the length of each array.

        int n1 = midPoint - leftIndex + 1;
        int n2 = rightIndex - midPoint;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Fill out the left and right array.

        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[leftIndex+i];
        }

        for(int i = 0; i < n2; i++){
            rightArray[i] = arr[midPoint+1+i];
        }

        // compare two arrays for the bigger ones.
        // {7, 8, 12 --- 88, 199, 899}

        // pointer to iterate through 3 arrays present.
        int i = 0, j = 0, k=leftIndex;

        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            } else arr[k++] = rightArray[j++];
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

//        System.arraycopy(leftArray, i, arr, k, n1 - i + 1);
//        System.arraycopy(rightArray, j, arr, k, n2 - j + 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, -6, 9, -44, 18, -12};
        sort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }


}
