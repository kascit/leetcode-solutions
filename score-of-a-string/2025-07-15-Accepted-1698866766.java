/*
 * Submission: 1698866766
 * Problem: Score of a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 13:58:30 UTC
 * Runtime: 1 ms
 * Memory: 42 MB
 */

class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++){
            sum += Math.abs((int) (s.charAt(i) - s.charAt(i + 1)));
        }
        return sum;
    }
}