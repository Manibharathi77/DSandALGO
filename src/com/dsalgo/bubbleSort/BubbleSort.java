package com.dsalgo.bubbleSort;

public class BubbleSort {

    public void swap(int[] array, int x, int y){

        if(x == y){
            return;
        }

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public void sort(int[] intArray){

        for (int unSortedArray = intArray.length - 1; unSortedArray > 0; unSortedArray--) {
            for (int i = 0; i < unSortedArray; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    this.swap(intArray, i, i + 1);
                }
            }
        }
        System.out.println("Bubble sort..");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
    }
}
