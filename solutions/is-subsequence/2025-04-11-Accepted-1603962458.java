/*
 * Submission: 1603962458
 * Problem: Is Subsequence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 19:24:25 UTC
 * Runtime: 2 ms
 * Memory: 41.5 MB
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();        
    }
}