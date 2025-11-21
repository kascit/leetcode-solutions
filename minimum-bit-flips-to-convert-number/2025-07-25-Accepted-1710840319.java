/*
 * Submission: 1710840319
 * Problem: Minimum Bit Flips to Convert Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 10:21:00 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public int minBitFlips(int start, int goal) {
        start ^= goal;
        int cnt = 0;
        while(start>0){
            start &= (start-1);
            cnt++;
        }
        return cnt;
    }
}