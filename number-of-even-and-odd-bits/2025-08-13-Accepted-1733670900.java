/*
 * Submission: 1733670900
 * Problem: Number of Even and Odd Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 11:57:26 UTC
 * Runtime: 1 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int flag = 0;
        while(n > 0){
            ans[flag] += ( (n&1) == 1 ) ? 1 : 0;
            flag ^= 1;
            n >>= 1;
        } return ans;
    }
}