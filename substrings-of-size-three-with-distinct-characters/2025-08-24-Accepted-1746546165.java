/*
 * Submission: 1746546165
 * Problem: Substrings of Size Three with Distinct Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:36:51 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int countGoodSubstrings(String s) {
        int len = s.length(), ans = 0;
        for (int i = 0; i < len - 2; i++) {
            if (
                s.charAt(i) == s.charAt(i+1) ||
                s.charAt(i) == s.charAt(i+2) ||
                s.charAt(i+1) == s.charAt(i+2) 
            ) {
                continue;
            } else ans++;
        } return ans;
    }
}