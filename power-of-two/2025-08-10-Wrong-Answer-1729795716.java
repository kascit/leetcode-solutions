/*
 * Submission: 1729795716
 * Problem: Power of Two (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-10 06:44:58 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n&(n-1)) == 0);
    }
}