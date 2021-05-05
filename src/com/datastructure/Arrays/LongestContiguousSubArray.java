package com.datastructure.Arrays;

public class LongestContiguousSubArray {

    // 8, -4, 9, -2, 5, -6, 6 // DYNAMIC PROBLEM

    // have two variables -> max_so_far = 0 , max_ending_here = min value

    public static int maxSum(int[] arr){

        int maxTillNow = arr[0]; int maxSoFar = arr[0];

        for(int i = 1; i < arr.length; i++){

            maxTillNow = Math.max(maxTillNow + arr[i], arr[i]); // 4

            maxSoFar = Math.max(maxTillNow, maxSoFar);
        }

        return maxSoFar;

    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{ -1, 2, -9, 12, 18, -44, 4 }));
    }

}
