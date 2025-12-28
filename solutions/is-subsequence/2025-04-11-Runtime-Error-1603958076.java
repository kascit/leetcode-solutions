/*
 * Submission: 1603958076
 * Problem: Is Subsequence (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-11 19:17:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if (n > m) return false;
        int l = 0, r = 0;
        while(r < m){
            char cur = s.charAt(l);
            while(r < m && t.charAt(r) != cur) r++;
            r++;
            l++;
        }
        return l == n;
    }
}