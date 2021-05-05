package com.datastructure.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Find2numAddToTargetVal {

    /*
    can be done using two type -> 1. two pointer technique on sorted list. O(n log n)
    2. Hashing technique.( hash set ) O(n)
     */

    // Hashing technique.
    public static int[] findTwoNumber(int [] arr, int sum){

        // if -> for the current index value, there exists a match in hash set.
        // if not add the value to the hash set and continue the iteration.

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++){ // O(n)
            int matchValue = sum - arr[i];

            if(hashSet.contains(matchValue)){ // O(1)
                return new int[]{arr[i], matchValue};
            } else {
                hashSet.add(arr[i]);
            }

        }

        return new int[0];
    }

    public static boolean findSumNumber(int[] arr, int sum){

        HashSet<Integer> hashSet = new HashSet<>();

        // -1, 4, 6, 7  ->>> 10

        for(int i = 0; i < arr.length; i++){
            int requiredSum = sum - arr[i];
            if(hashSet.contains(requiredSum)){
                return true;
            }

            else hashSet.add(arr[i]);
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(findSumNumber(new int[]{5, 6, -1, 5}, 5));

//        System.out.println(Arrays.toString(findTwoNumber(new int[]{5, 6, -1, 5}, 10)));
    }

}
