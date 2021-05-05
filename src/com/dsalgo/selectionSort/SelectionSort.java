package com.dsalgo.selectionSort;

public class SelectionSort {

    /**
     * @description: selection sort: select the largest of array and sort it to last index, again select the second largest
     * element and sort it to last before index and so on...
     * @param array
     * @param x
     * @param y
     */
    public void swap(int[] array, int x, int y){

        if(x == y){
            return;
        }

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public void sort(int[] selectionSortArray){

        for (int unSortedArray = selectionSortArray.length - 1; unSortedArray > 0; unSortedArray--) {
            int largestIndex = 0;

            for (int i = 1; i <= unSortedArray; i++) {
                if (selectionSortArray[i] > selectionSortArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            this.swap(selectionSortArray, largestIndex, unSortedArray);
        }
        System.out.println("selection sort..");
        for (int i = 0; i < selectionSortArray.length; i++) {
            System.out.print(selectionSortArray[i]);
            System.out.print(" ");
        }
    }

}
