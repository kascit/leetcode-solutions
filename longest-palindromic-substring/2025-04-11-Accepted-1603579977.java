/*
 * Submission: 1603579977
 * Problem: Longest Palindromic Substring (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 11:08:17 UTC
 * Runtime: 15 ms
 * Memory: 42.6 MB
 */

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // Odd-length palindrome
            int len2 = expandFromCenter(s, i, i + 1); // Even-length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
