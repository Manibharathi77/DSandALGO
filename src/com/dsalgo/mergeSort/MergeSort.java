package com.dsalgo.mergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    // array = { 2, 1, 6, 5, 4 }

    public int[] merge(int[] left, int[] right){
        return null;
    }

    public void sort(int[] array, int start, int end){

        if(start == end){
            return;
        }

        int middle = (start + end)/2;
        int leftEle = start + middle + 1;
        int rightEle = end - leftEle;

        int[] leftArray = new int[leftEle]; // 2, 1, 6
        int[] rightArray = new int[rightEle]; // 5, 4

        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = array[i];
        }

        for(int j = middle; j < rightArray.length; j++){
            rightArray[j-middle] = array[j];
        }

        System.out.println(Arrays.toString(leftArray));
        System.out.println(Arrays.toString(rightArray));


        sort(array, start, middle);
        sort(array, middle+1, end);

    }
}
