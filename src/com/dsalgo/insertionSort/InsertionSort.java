package com.dsalgo.insertionSort;

public class InsertionSort {

    /**
     * @Description: Consider the first element 0 of the array as sorted and compare 1 to 0 and sort them,
     * then, select the 2 and compare with the 0,1 and sort them.. Same goes on and on.
     * @param insertionSortArray
     */

    public void sort(int[] insertionSortArray){

        for(int i = 1; i < insertionSortArray.length; i++){
            int current = insertionSortArray[i];
            int j;
            for(j = i-1; j >= 0 && insertionSortArray[j] > current; j-- ){
                insertionSortArray[j+1] = insertionSortArray[j];
            }
            insertionSortArray[j+1] = current;
        }

        System.out.println("Insertion sort..");
        for (int value : insertionSortArray) {
            System.out.print(value);
            System.out.print(" ");
        }

    }
}
