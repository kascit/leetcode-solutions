/*
 * Submission: 1762420346
 * Problem: Check Whether Two Strings are Almost Equivalent (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:05:50 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq = new int[26];
        int len = word1.length();
        for (int i = 0; i < len; i++) {
            freq[word1.charAt(i)-'a']++;
        }
        for (int i = 0; i < len; i++) {
            freq[word2.charAt(i)-'a']--;
        }
        for (int f : freq) {
            if (f < -3 || f > 3) return false;
        } return true;
    }
}