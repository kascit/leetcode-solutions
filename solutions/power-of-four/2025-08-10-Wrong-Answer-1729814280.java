/*
 * Submission: 1729814280
 * Problem: Power of Four (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-10 07:03:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        return ((n&(n-1)) == 0) && ((n | 0b01010101010101010101010101010101) == 0b01010101010101010101010101010101);
    }
}