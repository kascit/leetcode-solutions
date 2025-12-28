/*
 * Submission: 1706138652
 * Problem: Decode XORed Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:48:58 UTC
 * Runtime: 2 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ans = new int[n+1];
        ans[0] = first;
        for (int i = 1; i < n + 1; i++){
            ans[i] = ans[i-1] ^ encoded[i-1];
        }
        return ans;
    }
}