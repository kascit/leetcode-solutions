/*
 * Submission: 1603580417
 * Problem: Longest Palindromic Substring (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 11:09:02 UTC
 * Runtime: 8 ms
 * Memory: 43.6 MB
 */

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Transform the string: add boundaries to handle even-length palindromes
        StringBuilder t = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#$");
        String str = t.toString();

        int n = str.length();
        int[] p = new int[n];  // radius array
        int center = 0, right = 0;
        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Try expanding around i
            while (str.charAt(i + (1 + p[i])) == str.charAt(i - (1 + p[i]))) {
                p[i]++;
            }

            // Update center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        // Find the max length and its center
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;  // Map back to original string
        return s.substring(start, start + maxLen);
    }
}
