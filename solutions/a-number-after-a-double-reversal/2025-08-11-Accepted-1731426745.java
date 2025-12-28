/*
 * Submission: 1731426745
 * Problem: A Number After a Double Reversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:02:37 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        if (num%10 == 0)return false;
        return true;
    }
}