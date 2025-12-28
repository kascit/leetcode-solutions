/*
Submission: 1836128775
Status: Accepted
Timestamp: 2025-11-21 16:26:29 UTC
Runtime: 2 ms
Memory: 137.9 MB
*/

class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1, tx = 0, ox = 0;
        int[] ans = new int[n];
        for (int i = 1; i <= n; i++) tx ^= i;
        for (int i = 1; i < n - 1; i+=2) ox ^= encoded[i];
        ans[0] = tx ^ ox;
        for (int i = 1; i < n; i++) {
            ans[i] = encoded[i-1]^ans[i-1];
        } return ans;
    }
}