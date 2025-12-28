/*
 * Submission: 1603577975
 * Problem: Longest Palindromic Substring (Medium)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-11 11:04:59 UTC
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
                String cur = sb.toString();
                max = ( cur.equals(sb.reverse().toString())  ) ? Math.max(max,sb.length()) : max;
                if (max == sb.length()) String ans = cur;
            }
        }
        return ans;
    }
}