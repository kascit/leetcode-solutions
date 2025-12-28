/*
 * Submission: 1701093243
 * Problem: Find Valid Pair of Adjacent Digits in String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 09:16:28 UTC
 * Runtime: 2 ms
 * Memory: 42.5 MB
 */

class Solution {
    public String findValidPair(String s) {
        int[] freq = new int[10];
        int n = s.length();
        for (int i = 0; i < n; i++){

            freq[s.charAt(i) - '0']++;
        }
        // for (int i = 0; i < 10; i++){
        //     System.out.println(freq[i]);
        // }
        
        for ( int i = 0; i < n - 1; i++ ){
            char first = s.charAt(i), second = s.charAt(i+1);
            if( first != second && freq[first -'0'] == Character.getNumericValue(first) && freq[second - '0'] == Character.getNumericValue(second)) {
                return new StringBuilder(String.valueOf(first)+String.valueOf(second)).toString();
            }
        }
        return "";
    }
}