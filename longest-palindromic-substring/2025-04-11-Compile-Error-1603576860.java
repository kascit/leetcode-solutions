/*
 * Submission: 1603576860
 * Problem: Longest Palindromic Substring (Medium)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-11 11:03:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 1;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                max = ( sb.toString().equals(sb.reverse().toString())  ) ? Math.max(max,sb.length()) : max;
            }
        }
    }
}