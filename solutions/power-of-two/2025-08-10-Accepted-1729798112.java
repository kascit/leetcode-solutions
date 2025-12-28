/*
 * Submission: 1729798112
 * Problem: Power of Two (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 06:47:21 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n == Integer.MIN_VALUE) return false;
        return ((n&(n-1)) == 0);
    }
}