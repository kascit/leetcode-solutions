/*
 * Submission: 1705530171
 * Problem: Remove Digit From Number to Maximize Result (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 05:58:18 UTC
 * Runtime: 2 ms
 * Memory: 42.3 MB
 */

class Solution {
    public String removeDigit(String number, char digit) {
       int n = number.length(); 
        String max = "";
       for (int i = 0; i < n; i++){
            if (number.charAt(i) == digit){
                String cur = number.substring(0,i) + number.substring(i+1,n);
                if (cur.compareTo(max) > 0){
                    max = cur;
                }
            }
       }
       return max;
    }
}