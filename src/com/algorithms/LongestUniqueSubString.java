package com.algorithms;

public class LongestUniqueSubString {

    /**
     * Uses the sliding window technique.
     */


   public static int longestSubStringFinder(String s){

       int[] chars = new int[128];

       int leftEnd = 0;
       int rightEnd = 0;

       int maxLength = Integer.MIN_VALUE;

       // "M A N I B H A R A T H I"

       while(rightEnd <= s.length()-1){

           char r = s.charAt(rightEnd);
           chars[r]++;

           while(chars[r] > 1){
               char l = s.charAt(leftEnd);
               chars[l]--;
               leftEnd++;
           }

           maxLength = Math.max(maxLength, rightEnd - leftEnd + 1);
           rightEnd++;

       }

       return maxLength;

   }

    public static void main(String[] args) {

        System.out.println(longestSubStringFinder("manibharathi"));

    }


}
