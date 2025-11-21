/*
 * Submission: 1702307918
 * Problem: Reverse Degree of a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 10:25:29 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            sum +=  (26 - (s.charAt(i) - 'a')) * (i+1);
        }
        return sum;
    }
}