/*
 * Submission: 1603958629
 * Problem: Is Subsequence (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 19:18:44 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if (n > m) return false;
        if (n == 0) return true;
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