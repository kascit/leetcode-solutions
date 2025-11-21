/*
 * Submission: 1738894987
 * Problem: Count Prefixes of a Given String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:52:34 UTC
 * Runtime: 0 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for (String w : words) {
            if (s.startsWith(w)) {
                ans++;
            }
        } return ans;
    }
}