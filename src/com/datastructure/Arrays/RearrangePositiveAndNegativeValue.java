package com.datastructure.Arrays;

import java.util.Arrays;

public class RearrangePositiveAndNegativeValue {

    /**
     * Space complexity = O(n)
     * Time Complexity = O(n^2)
     */

    // {5, 6, -9, -9, -12, -44} -> {5,9,18,  -6,-12,-44}

    public static int[] reArrange(int[] arr){

        int temp; int pointer2;

        for(int pointer1 = 0; pointer1 < arr.length; pointer1++){  //O(n)

            if(arr[pointer1] < 0){

                pointer2 = pointer1;

                while(pointer2 < arr.length - 1 && arr[pointer2+1] < 0){
                    pointer2++;
                }

                if(pointer2 < arr.length - 1){

                    temp = arr[pointer2+1];

                    while(pointer1 <= pointer2){
                        arr[pointer2+1] = arr[pointer2];
                        pointer2--;
                    }
                 arr[pointer1] = temp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reArrange(new int[]{-1,2,-9, 12, 18, -44})));
    }


}
