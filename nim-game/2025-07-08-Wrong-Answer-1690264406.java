/*
 * Submission: 1690264406
 * Problem: Nim Game (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-08 03:50:56 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canWinNim(int n) {
        if (n<=3) return true;
        else {
            if (canWinNim(n-1)){
                return false;
            }
            else {
                return true;
            }
        }
    }
}