/*
 * Submission: 1737037708
 * Problem: Power of Four (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-16 08:42:20 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1 || n == 0) return true;
        return (n%4 == 0) && isPowerOfFour(n/4);
    }
}