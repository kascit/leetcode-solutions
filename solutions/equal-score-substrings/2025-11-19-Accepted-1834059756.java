/*
 * Submission: 1834059756
 * Problem: Equal Score Substrings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:02:08 UTC
 * Runtime: 1 ms
 * Memory: 43.6 MB
 */

class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int tot = 0;
        for (int i = 0; i < n; i++) tot += s.charAt(i) - 'a' + 1;

        int pref = 0;
        for (int i = 0; i < n - 1; i++) {
            pref += s.charAt(i) - 'a' + 1;
            if (pref * 2 == tot) return true;
        }
        return false;
    }
}
