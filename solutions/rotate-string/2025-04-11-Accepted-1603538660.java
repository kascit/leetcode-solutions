/*
 * Submission: 1603538660
 * Problem: Rotate String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:05:19 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        return goal.length() == s.length() && (goal+goal).contains(s) ;
    }
}