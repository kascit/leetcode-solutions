/*
 * Submission: 1691502638
 * Problem: Reverse Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-09 04:19:16 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int m = 0;
        for(int i = 1; i <= 32; i++){

            
            m <<= 1;
            m |= n&1;
            n >>= 1;
        }
        return m;
    }
}