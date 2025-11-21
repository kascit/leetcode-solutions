/*
 * Submission: 1736979913
 * Problem: Smallest Number With All Set Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:36:17 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int smallestNumber(int n) {
        int ans = 0;
        while (n > 0){
            ans <<= 1;
            n >>= 1;
            ans |= 1;
        } return ans;
    }
}