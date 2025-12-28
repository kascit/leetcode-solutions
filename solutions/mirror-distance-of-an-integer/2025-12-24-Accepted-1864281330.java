/*
Submission: 1864281330
Status: Accepted
Timestamp: 2025-12-24 15:10:57 UTC
Runtime: 1 ms
Memory: 42.3 MB
*/

class Solution {
    public int mirrorDistance(int n) {
        int t = n, r = 0;
        while (t > 0) {
          r *= 10;
          r += t % 10;
          t /= 10;
        } return Math.abs(r-n);
    }
}