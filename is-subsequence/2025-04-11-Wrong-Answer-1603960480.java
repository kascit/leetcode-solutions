/*
 * Submission: 1603960480
 * Problem: Is Subsequence (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 19:21:30 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if (n > m) return false;
        if (n == 0) return true;
        if (n == 1 && m == 1) return s.charAt(0) == t.charAt(0);
        int l = 0, r = 0;
        while(r < m){
            char cur = s.charAt(l);
            while(r < m && t.charAt(r) != cur) r++;
            r++;
            //if (r >= m)break;
            l++;
        }
        return l == n;
    }
}