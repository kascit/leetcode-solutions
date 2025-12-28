/*
 * Submission: 1690259393
 * Problem: Nim Game (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-08 03:44:26 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canWinNim(int n) {
        if (n<=3) return true;
        return n%3 != 1;
    }
}