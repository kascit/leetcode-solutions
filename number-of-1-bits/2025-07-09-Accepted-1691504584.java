/*
 * Submission: 1691504584
 * Problem: Number of 1 Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-09 04:21:45 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n>0){
            n &= (n-1);
            cnt++;
        }
        return cnt;
    }
}