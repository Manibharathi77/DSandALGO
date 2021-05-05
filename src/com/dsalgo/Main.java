package com.dsalgo;

import com.dsalgo.bubbleSort.BubbleSort;
import com.dsalgo.mergeSort.MergeSort;
import com.dsalgo.selectionSort.SelectionSort;
import com.dsalgo.shellSort.ShellSort;

public class Main {

    public static void main(String[] args) {
        /**
         * Bubble sort algorithm checking..
         */

        BubbleSort bubbleSort = new BubbleSort();


        /**
         * End of bubble sort section..
         */

        /**
         * Selection sort..
         */

        SelectionSort selectionSort = new SelectionSort();


        /**
         * Selection sort ends here...
         */


        /**
         * Insertion sort
         */
        int[] insertionSortArray = {5, 3, 2, 4, -2, -1, 100, 10};

        /**
         * Shell sort testing.
         */

        ShellSort shellSort = new ShellSort();

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(insertionSortArray, 0, insertionSortArray.length -1);

//        shellSort.sort(insertionSortArray);



//        for(int i = 1; i < insertionSortArray.length; i++){
//            int currentElement = insertionSortArray[i];
//            int value;
//            for(value = i; value > 0 && insertionSortArray[value-1] > currentElement; value-- ){
//                insertionSortArray[value] = insertionSortArray[value-1];
//            }
//            insertionSortArray[value] = currentElement;
//            System.out.println("value: " +value);
//        }


    }
}

