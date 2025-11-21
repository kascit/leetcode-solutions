/*
 * Submission: 1830566996
 * Problem: Remove Zeros in Decimal Representation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:39:42 UTC
 * Runtime: 1 ms
 * Memory: 42.7 MB
 */

class Solution {
    public long removeZeros(long n) {
        return solve(n,1,0);
    }

    long solve(long n, long pos, long cur) {
        if (n == 0) return cur;
        int mod = (int)(n%10);
        n/=10;
        if (mod == 0) {
            return solve(n,pos,cur);
        }
        return solve(n,pos*10,cur+pos*mod);
    }
}