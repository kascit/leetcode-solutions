/*
Submission: 1864285497
Status: Accepted
Timestamp: 2025-12-24 15:17:08 UTC
Runtime: 1 ms
Memory: 42.8 MB
*/

class Solution {
    public int minimumFlips(int n) {
        int r = 0, t = n;
        while (t > 0) {
          r <<= 1;
          r |= (t&1);
          t >>= 1;
        }
        int cnt = 0;
        r ^= n;
        while (r > 0) {
          r &= (r-1);
          cnt++;
        } return cnt;
    }
}