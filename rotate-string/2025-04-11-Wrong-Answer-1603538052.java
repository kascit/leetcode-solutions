/*
 * Submission: 1603538052
 * Problem: Rotate String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 10:04:24 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        return (goal+goal).contains(s);
    }
}