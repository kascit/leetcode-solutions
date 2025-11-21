/*
 * Submission: 1764659396
 * Problem: Stone Removal Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-09 07:17:02 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) return false;
        if (n < 19) return true;
        if (n < 27) return false;
        if (n < 34) return true;
        if (n < 40) return false;
        if (n < 45) return true;
        if (n < 49) return false;
        return true;
    }
}