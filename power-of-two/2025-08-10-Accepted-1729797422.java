/*
 * Submission: 1729797422
 * Problem: Power of Two (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 06:46:40 UTC
 * Runtime: 1 ms
 * Memory: 41.1 MB
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        return ((n&(n-1)) == 0);
    }
}