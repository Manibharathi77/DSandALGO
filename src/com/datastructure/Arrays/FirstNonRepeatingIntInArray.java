package com.datastructure.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingIntInArray {

    // {9, 7, 5, 0, 9, 7, 1}  ->>> 5 since it is first non repeating

    // can be done using hashset hash map. -> O(n)
    // can be done in O(n^2) using two for loop.

    // hashing

    public static void getVal(int[] arr){

        Map<Integer, Integer> trackerMap = new LinkedHashMap<>();

        for(int i : arr){
            if(trackerMap.containsKey(i)){
                trackerMap.put(i ,trackerMap.get(i)+1 );
            } else {
                trackerMap.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entrySet : trackerMap.entrySet()){
            if(entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            getVal(new int[]{9, 7, 5, 9, 7, 1});
    }

}
