package com.dsalgo.shellSort;

public class ShellSort {

    // array = {7, -10, 5, 8, 1, 9, 3}

    public void sort(int[] arrays){

        int [] array = {77, -10, 5, 8, 1, 9, 3};

        for (int gap = array.length/2; gap > 0; gap /= 2){

            for(int i = gap; i < array.length; i++ ){

                int temp = array[i];

                int j;
                for(j = i; j >= gap && array[j - gap] > temp; j -= gap){

                    array[j] = array[j-gap];

                }

                array[j] = temp;


            }

        }

        System.out.println("Shell sort..");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }

    }
}
