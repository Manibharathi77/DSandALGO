package com.datastructure.Arrays;

public class MinimumValueInArray {


    // {8,4,6,7}


    public static int getMinimumValue(int[] arr){
        int currentMinimumValue = Integer.MAX_VALUE;

        for(int i: arr){
            if(i < currentMinimumValue){
                currentMinimumValue = i;
            }
        }

        return currentMinimumValue;
    }

    public static void main(String[] args) {
        System.out.println(getMinimumValue(new int[]{8, 9 , -1, 0}));
    }

}
