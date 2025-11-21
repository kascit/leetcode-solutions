/*
 * Submission: 1738894297
 * Problem: Count Prefixes of a Given String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:51:50 UTC
 * Runtime: 1 ms
 * Memory: 43.6 MB
 */

class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0, len = s.length();
        for (String w : words) {
            if (w.length() <= len && s.indexOf(w) == 0) {
                ans++;
            }
        } return ans;
    }
}