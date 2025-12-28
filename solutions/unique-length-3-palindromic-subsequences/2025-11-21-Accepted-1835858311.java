/*
 * Submission: 1835858311
 * Problem: Unique Length-3 Palindromic Subsequences (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 08:41:30 UTC
 * Runtime: 41 ms
 * Memory: 47 MB
 */

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] freq = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)-'a']++;
        }
        int[] req = new int[26];
        boolean[][] seen = new boolean[26][26];
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int mid = s.charAt(i)-'a';
            freq[mid]--;

            for (int j = 0; j < 26; j++) {
                if (freq[j] > 0 && req[j] > 0 && !seen[mid][j]) {
                    seen[mid][j] = true;
                    ans++;
                }
            }

            req[mid]++;
        } return ans;
    }
}