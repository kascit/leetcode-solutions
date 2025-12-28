/*
 * Submission: 1736961480
 * Problem: Smallest Number With All Set Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:17:41 UTC
 * Runtime: 1 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int smallestNumber(int n) {
        int ans  = 0, t = 1;
        while (n > 0){
            n -= t;
            ans += t;
            t <<= 1;
        } return ans;
    }
}