/*
 * Submission: 1835861281
 * Problem: Minimum Number of Steps to Make Two Strings Anagram (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 08:47:00 UTC
 * Runtime: 6 ms
 * Memory: 47.7 MB
 */

class Solution {
    public int minSteps(String s, String t) {
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq[ch-'a']--;
        }

        int ans = 0;
        for (int n : freq) {
            if (n > 0)
            ans += n;
        } return ans;
    }
}