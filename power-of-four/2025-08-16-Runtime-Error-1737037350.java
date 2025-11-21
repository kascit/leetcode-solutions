/*
 * Submission: 1737037350
 * Problem: Power of Four (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-16 08:41:55 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        return (n%4 == 0) && isPowerOfFour(n/4);
    }
}