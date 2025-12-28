/*
 * Submission: 1724522048
 * Problem: Count of Matches in Tournament (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:06:42 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        while (n > 1){
            ans += (n/2);
            n -= n/2;
        } return ans;
    }
}