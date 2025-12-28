/*
 * Submission: 1690262912
 * Problem: Nim Game (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-08 03:48:59 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canWinNim(int n) {
        if (n<=3) return true;
        else {
            if (canWinNim(n-1) || canWinNim(n-2) || canWinNim(n-3)){
                return false;
            }
        }
        return true;
    }
}